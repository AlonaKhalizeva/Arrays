/**
 * Created by Alyona on 19.05.2015.
 */
public class lect06 {
    private int i;
    private String str = "a";
    private double b;

    public int getI() {
        return i;
    }

    public void setI(int i) {

        if(i>0 && i < 100) {
            this.i = i;
        } else {
            System.out.println("put the correct age, please");
        }
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "lect06{" +
                "i=" + i +
                ", str='" + str + '\'' +
                ", b=" + b +
                '}';
    }
}
