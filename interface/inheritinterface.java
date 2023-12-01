
interface a{
    public void add();
}
interface b extends a{
    public void sub();
}
class c implements b{
    int r,t;
    c(int r,int t){
        this.r=r;
        this.t=t;
    }
    public void add(){
        System.out.println("result:"+(r+t));
    }
    public void sub(){
        System.out.println("result:"+(r-t));
    }
}


public class inheritinterface {
    public static void main(String args[]){
        c obj = new c(50,10);
        obj.add();
        obj.sub();
    }
}
