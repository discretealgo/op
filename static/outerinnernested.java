
public class outerinnernested {
    private static int var=1;
    static int svar=2;
    int v=3;
    private int pvar=4;
    static class nested{
        public void printt(){
            System.out.println("value for nested"+var+" "+svar);
        }
    }
    class inner{
        public void printt(){
                System.out.println("Values for inner"+var+" "+svar+" "+v+" "+pvar);
        }
    }
    public static void main(String args[]){
        outerinnernested o=new outerinnernested();
        outerinnernested.nested o2=new outerinnernested.nested();
        o2.printt();
        outerinnernested.inner o3=o.new inner();
        o3.printt();
    }
}
