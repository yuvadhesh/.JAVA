import java.util.Scanner;
public class Q05{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n,digit;
        n=sc.nextInt();
        int reverse=0;
        while(n!=0){
            digit=n%10;
            reverse=reverse*10+digit;
            n=n/10;
        }
        System.out.print(reverse);
    }
}