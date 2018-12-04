package info.staticfree.SuperGenPass;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class ForgetMasterPass extends Activity {

    private Button getbutton;
    private EditText answerText;
    private EditText webText;
    private Spinner result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_main_pass);
        getbutton = findViewById(R.id.getButton);
        answerText = findViewById(R.id.answerEdit);
        webText = findViewById(R.id.websiteEdit);
        result = findViewById(R.id.mpSpinner);

        getbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String myanswer = answerText.getText().toString();
                SecureQuestion sq = new SecureQuestion();
                if(myanswer.equals(sq.getAnswer())) {
                    D_MpBuff b = new D_MpBuff();
                    ArrayList<String> r = b.find(webText.getText().toString());
                    String[] arr = r.toArray(new String[r.size()]);
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(ForgetMasterPass.this, android.R.layout.simple_spinner_dropdown_item, arr);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    result .setAdapter(adapter);
                }
                else answerText.getText().clear();
            }
        });
    }
}
