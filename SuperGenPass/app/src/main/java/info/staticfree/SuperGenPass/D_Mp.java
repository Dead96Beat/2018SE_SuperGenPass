package info.staticfree.SuperGenPass;

public class D_Mp {
    private String Domain;
    private String MasterPass;

    public D_Mp(String d, String m){
        this.Domain = d;
        this.MasterPass = m;
    }

    public String getDomain() {
        return this.Domain;
    }

    public String getMasterPass() {
        return this.MasterPass;
    }
}
