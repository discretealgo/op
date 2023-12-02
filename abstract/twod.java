import java.util.*;
abstract class td{
    abstract void display();
}
class rec extends td{
    int l,b;
    public rec(int l,int b){
        this.l=l;this.b=b;
    }
    double cal(int l,int b){
        double a=l*b;
        return a;
    }
    void display(){
        double bt;
        bt=cal(l,b);
        System.out.println("Area is "+bt);
    }
}
class tri extends td{
    int a,b,c;
    public tri(int a,int b,int c){
        this.a=a;this.b=b;this.c=c;
    }
    double cal(int a,int b,int c){
        int  p=(a+b+c);
        double s=p/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area is "+area);
        return area;
    }
    void display(){
        double bt=cal(a,b,c);
        System.out.println("Area is "+bt);
    }
}
public class twod {
    public static void main(String args[]){
        rec r=new rec(10,15);
        r.display();
        tri t=new tri(5,4,6);
        t.display();
    }
}
