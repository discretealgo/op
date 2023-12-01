class usethrows{
    public static void main(String[] args) {
        try{
            methodmin();
        }catch(Exception e){
            System.out.println("Exception");
        }
    }
        private static void methodmin() throws ArithmeticException{
            int a=10/0;
        }
}