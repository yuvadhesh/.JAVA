import java.util.Scanner;
public class Q5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int temp=number;
        int prevDigit=10;
        int count=0;
        while(temp>0){
            int rem=temp%10;
            if (rem>prevDigit){
                count++;
                break;
            }
            prevDigit=rem;
            temp=temp/10;
        }
        if(count==0){
            System.out.println("ascending");
        }
         else{
            System.out.println("not");
        }
    }
}
