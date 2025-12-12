import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       char a=sc.next().charAt(0);
        if(Character.isUpperCase(a)){
            System.out.print("UpperCase");
        }
       else if(Character.isLowerCase(a)){
        System.out.print("Lowercase");
       }
       else{
        System.out.print("Invalid Input");
       }
    }
}