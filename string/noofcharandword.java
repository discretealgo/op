import java.util.*;
class noofcharandword{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String l=sc.nextLine();
        int count = l.length();
        int wordcount=l.split(" ").length;
        System.out.println("No of character is "+count+" and no of word is "+wordcount);
    }
}