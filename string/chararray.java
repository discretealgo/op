class chararray{
    public static String toString(char[] a){
        String s = new String(a);
        return s;

    }
    public static void main(String args[]){
        char st[]={'r','a'};
        System.out.println("The string is "+toString(st));
    }
}
