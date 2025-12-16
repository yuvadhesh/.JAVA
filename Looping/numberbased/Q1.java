import java.util.Scanner;
public class Q1{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=0;
    int b=1;
    int next;
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        System.out.print(a+" ");
        next=a+b;
        a=b;
        b=next;
    }
}
}
