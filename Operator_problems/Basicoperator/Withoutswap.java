import java.util.Scanner;
public class Withoutswap{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c;
     a=a+b;
     b=a-b;
     a=a-b;
     System.out.print(a+""+b);
    }
}