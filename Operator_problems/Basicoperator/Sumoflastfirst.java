import java.util.Scanner;
public class Sumoflastfirst{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n1=a/100;
        int  n2=a%10;
        System.out.print((n1)+(n2));
    }
}
