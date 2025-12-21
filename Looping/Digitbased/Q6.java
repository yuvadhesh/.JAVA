import java.util.Scanner;
public class Q6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int last=n%10;
        int first=0;
        int count=0;
        while(temp>0){
            temp=first;
            temp=temp/10;
            count++;
        }
        int power=(int)Math.pow(10,count-1);
        int middle=(n%power)/10;
        int result=last*power+middle*10+first;
        System.out.println(result);
    }
}
