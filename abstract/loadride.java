class A{
    int i,j;
    A(int x,int y){
        i=x;
        j=y;
    }
    void show(){
        System.out.println("Values : "+i+" "+j);
    }
}
class B extends A{
    int k;
    B(int x,int y,int z){
        super(x,y);
        k=z;
    }
    void show(String mssg){
        System.out.println("Message : "+mssg);
    }
    @Override
    void show(){
        System.out.println("Value of k"+k);
    }
}
class loadride {
    public static void main(String args[]){
        A a = new A(4,5);
        B b= new B(1,2,3);
        b.show("k is");
        b.show();
        a.show();
    }
}
