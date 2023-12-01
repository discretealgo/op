class excepnesttry{
    public static void main(String[] args){
        int b[]={12,15};
        try{
            try{
                int c=b[3];

            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array index out of bound");
            }
            int c=5/0;
        }catch(ArithmeticException e){
            System.out.println(e.toString());
        }
    }
}