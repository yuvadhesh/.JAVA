import java.util.Scanner;
public class Q8{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=a%10;
        if(b%3==0){
           System.out.println("a");
        }
        else{
            System.out.println("Not");
        }
    }}
