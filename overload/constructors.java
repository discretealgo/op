public class constructors {
    int val;
    constructors(){
        val=0;
    }
    constructors(int a){
        val=a;
    }
    constructors(constructors o){
        val=o.val;
    }
    public void display(int n){
        System.out.println("Object "+n+" has value "+val);
    }
    public static void main(String args[]){
        new constructors().display(1);
        new constructors(5).display(2);
        new constructors(new constructors()).display(3);
    }
}
