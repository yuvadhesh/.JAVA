import java.util.Scanner;
public class Q2{
    public static void main(String[]aargs){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=18){
            System.out.print("Eligible");
        }
        else{
            System.out.print("Not");
        }
    }
} 