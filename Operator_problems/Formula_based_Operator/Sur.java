import java.util.Scanner;
public class Sur{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int l=sc.nextInt();
    int b=sc.nextInt();
    int h=sc.nextInt();
    int d;
    d=2*(l*b+b*h+h*l);
    System.out.print(d);

    }
}
