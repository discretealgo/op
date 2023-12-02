package overload;

public class statics {
    static int a=10;
    static{
        a=120;
    }
    public static void main(String args[]){
        System.out.println("a="+statics.a);
    }
}
