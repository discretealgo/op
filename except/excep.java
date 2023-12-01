class excep{
    public static void main(String args[]){
        int n[]={21,23};
        try{
            int a=5/0;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());

        }
        try{
            int file = Integer.parseInt("abc");
        }catch(NumberFormatException e){System.out.println("Number format exception");}
        try{
            int e=n[4];
        }catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}
    }
}