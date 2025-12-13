import java.util.Scanner;
public class Q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==b &&b==c&&c==a){
            System.out.print("Equaleral");
        }
        else if((a==b)||(c==a)){
            System.out.print("isosel");
        }
        else{
            System.out.print("Scalene");
        }
    }}
