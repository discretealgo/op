

class complex {
    private static int c=0;
    public static void tc(){
        System.out.println("acitve object "+c);

    }
    public void finalize(){
        System.out.println("Destroy"+display());
        c--;
    }
    double a,b;
    complex(double a,double b){
        this.a = a;
        this.b=b;
        c++;
    }
    public String display(){
        return "("+this.a+"+"+this.b+"i)";
    }
    complex sum(complex o){
        return new complex(a+o.a,b+o.b);
    }
     complex diff(complex o){
        return new complex(a-o.a,b-o.b);
    }
    complex inverse(){
        return new complex(a,-b);
    }
    public void copy(complex o){
        this.a=o.a;
        this.b=o.b;
    }
    double mod(){
        return Math.sqrt(a*a+b*b);
    }
}
public class complexx{
    public static void main(String args[]){
        complex x1=new complex(2,3),y1=new complex(4,5);
        System.out.println("SUm is "+x1.sum(y1).display());
        complex.tc();
    }
}
