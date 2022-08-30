package src.encapsulation;

public class EncapsulationDemo {
    private int a;
    private String str;
    private boolean validName(String str){
        if(str.equals("dah")){
            return true;
        }return false;
    }
    private boolean validNumber(int a){
        if(a==1986){
            return true;
        }return false;
    }

    public EncapsulationDemo(int a, String str) {
        if(validNumber(a)) {
            this.a = a;
        }
        if(validName(str)) {
            this.str = str;
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
