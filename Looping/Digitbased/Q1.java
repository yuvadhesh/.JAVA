import java.util.Scanner;
public class Q1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int len=Integer.toString(a).length();
       while(a>=10){
            a=a/10;
        }
       System.out.print(a);
    }
}