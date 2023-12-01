import java.util.*;
class occofchar{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String l=sc.nextLine();
     
        System.out.println("Enter a char");
        char c=sc.next().charAt(0);
        int count=l.length();
        int countt=0;
        for (int i=0;i<count;i++){
            if(l.charAt(i)==c){
                countt++;
            }
        }
        System.out.println("The occurence of character "+c+" in the given string is "+countt);
}
}