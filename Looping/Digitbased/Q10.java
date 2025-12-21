import java.util.Scanner;
public class Q10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int temp=number;
        int min=9;
        while(temp>0){
            int rem=temp%10;
            if(rem<min){
                min=rem;
            }
            temp=temp/10;
        }
        System.out.println(min);
    }
}
