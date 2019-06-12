package ClassLoaders;

public class ReflexEx {
    private int i=7;
    protected String str="Test";
    public long d=8;
    public ReflexEx(){

    }

    public int getI() {
        return i;
    }

    public ReflexEx(int i){
        this.i=i;
    }

    private String getStr(String str) {
        return str;
    }


}
