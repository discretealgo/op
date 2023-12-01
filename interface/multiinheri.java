import java.util.*;
interface in1{
    double pi=3.14;
    public void circl();
}
interface in2{
    public void display();
}
class cir implements in1,in2{
    int r;
    cir(int r){
        this.r=r;
    }
    public void display(){
        System.out.println("calculate area of circle");

    }
    public void circl(){
            System.out.println("Area of cirlce is "+pi*r*r);
    }
}
public class multiinheri{
    public static void main(String args[]){
        int r;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter radius: ");
        r=sc.nextInt();
        cir a = new cir(r);
        a.circl();
    }
}