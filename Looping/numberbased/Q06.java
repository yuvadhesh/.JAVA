import java.util.Scanner;
public class Q06{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,digit;
        int reverse=0;
        n=sc.nextInt();
        int original=n;
        while(n!=0){
            digit=n%10;
            reverse=reverse*10+digit;
            n=n/10;
        }
        if(original==reverse){
            System.out.print("palindrome");
        }
        else{
            System.out.print("not");
        }
    }
}