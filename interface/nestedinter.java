


import java.util.*;
interface inn3{
    void display();
    interface inner{
        void areas();
    }
}
class area implements inn3.inner{
    int l,b;
    area(int l,int b){
        this.l=l;
        this.b=b;

    }
    public void display(){
        System.out.println("length = "+l+" breadth = "+b);
    }
    public void areas(){
        System.out.println("Area is "+l*b);
    }
}


public class nestedinter {
    public static void main(String args[]){
        int l,b;
        area r=new area(5,2);
        r.areas();
    }
}
