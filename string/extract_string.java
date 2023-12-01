class extract_string{
    public static void main(String args[]){
        String str="Hello";
        int starti=2;
        int endi=4;
        String strp=str.substring(starti,endi);
        System.out.println("The extracted string is "+strp);
    }
}