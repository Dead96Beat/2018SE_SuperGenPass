package info.staticfree.SuperGenPass;

import java.util.ArrayList;

public class D_MpBuff {
    public static ArrayList<D_Mp> buf = new ArrayList<D_Mp>();

    public void add(String d, String m){
        D_Mp temp = new D_Mp(d, m);
        buf.add(temp);
    }

    public ArrayList<String> find(String d){
        ArrayList<String> result = new ArrayList<String>();
        for(int i = 0 ; i < buf.size(); i++){
            if(buf.get(i).getDomain().equals((d)))
                result.add(buf.get(i).getMasterPass());
        }
        return result;
    }

}
