import java.util.Scanner;
public class Q9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int temp=number;
        int max=0;
        while(temp>0){
            int rem=temp%10;
            if(rem>max){
                max=rem;
            }
            temp=temp/10;
        }
        System.out.println(max);
    }
}
