package info.staticfree.SuperGenPass;

public final class SecureQuestion {

    private static String question = "What' My Name";
    private static String answer = "wdy";

    public SecureQuestion(){
    }

    public void setQuestion(String q){
        this.question = q;
    }

    public void setAnswer(String a){
        this.answer = a;
    }

    public String getQuestion(){
        return this.question;
    }

    public String getAnswer(){
        return this.answer;
    }

    public boolean verify(String myanswer){
        return this.answer.equals(myanswer);
    }

}
