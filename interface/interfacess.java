interface areas{
    int length=8;
    int width=5;
    public int area();
}
abstract class cc implements areas{
    public void display(){
        System.out.println("Testing");
    }
}
class cal implements areas{
    public int area(){
        return length*width;
    }
}
public class interfacess{
    public static void main(String args[]){
        cal c=new cal();
        System.out.println("Area: "+c.area());
    }
}