import java.util.Scanner;
public class Q10{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        if((a&1)==0 && (c%1==0)){
            System.out.print("Even");
        }
        else{
            System.out.print("Odd");
        }
    }
}