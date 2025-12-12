import java.util.Scanner;
public class Hms{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.print("HH:");
       int a=sc.nextInt();
       System.out.print("MM:");
       int b=sc.nextInt();
       System.out.print("SS:");
       int c=sc.nextInt();
       System.out.print(a+"/"+b+"/"+c);
    }
}
