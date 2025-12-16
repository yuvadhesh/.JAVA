import java.util.Scanner;
public class Q17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0,temp=num;
        while(temp>0){
            sum=sum+temp%10;
            temp=temp/10;
        }
        if (num%sum==0){
            System.out.println("Harshad");
                }
        else{
            System.out.println("NOT");
        }
    }
}
