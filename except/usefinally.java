public class usefinally{
    public static void main(String args[]){
        try{
            int a=10/0;
        }catch(ArithmeticException e){
            System.out.println(e.toString());
        }
        finally{
            System.out.println("Finally block executed");
        }
    }
}
