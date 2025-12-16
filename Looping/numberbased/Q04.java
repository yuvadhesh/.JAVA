import java.util.Scanner;
public class Q04{
    public static void main(String[] args) {
        int n,digit;
        int sum=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0){
            digit=n%10;
            sum=sum*digit;
            n=n/10;
        }
        System.out.println(sum);
    }
}
