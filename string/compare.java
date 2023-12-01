import java.util.Scanner;
class compare{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s1=sc.next();
        System.out.println("Enter the second string:");
        String s2=sc.next();
        if(s1.equals(s2)){
            System.out.println("They are equal");

        }
        else{
            System.out.println("They are not equal");
        }
    }
}