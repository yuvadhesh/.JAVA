import java.util.Scanner;
public class Q01{
    public static void main(String[] args){
        int N;
        long fact=1;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        for (int i=1;i<=N;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
