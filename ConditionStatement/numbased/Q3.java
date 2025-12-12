import java.util.Scanner;
public class Q3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        if((a&1)==0){
           System.out.println("Even num:"+a);
        }
    
        else{
            System.out.println("Odd num:"+a);
        }
    }}
