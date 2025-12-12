import java.util.Scanner;
public class Q14{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
   int rupee=sc.nextInt();
   int n2000=rupee/2000;
   rupee=rupee%2000;
   int n500=rupee/500;
   rupee=rupee%500;
   int n200=rupee/200;
   rupee=rupee%200;
  System.out.println(n2000);
  System.out.println(n500);
  System.out.println(n200);
} 
}