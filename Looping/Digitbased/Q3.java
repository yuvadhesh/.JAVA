import java.util.Scanner;
public class Q3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int count=0;
        int temp=a;
       while(temp>0){
            int rem=temp%10;
            if (rem==b){
                count++;
            }
            temp=temp/10;
        }
        System.out.print(count+"Occ");
       }
    }
