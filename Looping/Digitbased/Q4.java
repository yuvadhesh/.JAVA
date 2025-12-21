import java.util.Scanner;
public class Q4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int digit=sc.nextInt();
        int temp=number;
        int count=0;

        while (temp>0){
            int rem=temp%10;
            if(rem==digit){
                count++;
            }
            temp=temp/10;
        }
        if(count>0){
            System.out.println("occurred");
        } 
        else{
            System.out.println("not");
        }
    }
}
