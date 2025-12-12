import java.util.Scanner;
public class Middledigit{
    public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    int a=sc.nextInt();
    System.out.print((a/10)%10);
}
}