import java.util.Scanner;
public class Q11{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int temp=number;
        int newNum=0;
        int place=1;
        while (temp>0){
            int rem=temp%10;
            if(rem!=0){
                newNum=rem*place+newNum;
                place=place*10;
            }
            temp=temp/10;
        }
        System.out.println(newNum);
    }
}
