package info.staticfree.SuperGenPass;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Secure_verify extends Activity {
    private Button verbutton;
    private EditText answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secure_verify);

        verbutton = findViewById(R.id.verButton);
        answerText = findViewById(R.id.answerEdit);

        verbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String myanswer = answerText.getText().toString();
                SecureQuestion sq = new SecureQuestion();
                if(myanswer.equals(sq.getAnswer())) {
                    Intent intent = new Intent();
                    intent.putExtra("data","yes");
                    setResult(RESULT_OK, intent);
                    finish();
                }
                else answerText.getText().clear();
            }
        });
    }
}
