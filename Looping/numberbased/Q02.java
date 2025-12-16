import java.util.Scanner;
public class Q02{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num,digit;
        num=sc.nextInt();
        int sum=0;
        while(num!=0){
            digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        System.out.print(sum);
    } 
}