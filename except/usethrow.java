class usethrow{
    public static void main(String[] args){
        try{
            throw new ArithmeticException();
        }catch(Exception e){
            System.out.println(e);
        }
}}