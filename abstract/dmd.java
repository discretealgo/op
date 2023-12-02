class A{
    void call(){
        System.out.println("a");
    }
}
class B extends A{
    void call(){
        System.out.println("B");
    }
}
class C extends A{
    void call(){
        System.out.println("C");
    }
}

public class dmd {
    public static void main(String args[]){
        A a = new A();
        B b=new B();
        C c = new C();
        A r;
        r=a;
        r.call();
        r=b;
        r.call();
        r=c;
        r.call();
    }
}
