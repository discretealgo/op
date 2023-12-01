class implicitnested{
    public static void main(String args[]){
        try{
            excepmath();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    private static void excepmath() throws NullPointerException{
        try{
            throw new NullPointerException("Null pointer");
        }
        catch(ArithmeticException e){
            System.out.println("arithmetic exception");
        }
    }
}