

public class implicitcast {
    public void meth(double d){
        System.out.println(d);
    }
    public double meth(int a){
        return a;
    }
    public static void main(String args[]){
        implicitcast ic = new implicitcast();
        ic.meth(10.1);
        System.out.println(ic.meth(10));
    }
}
