import java.util.Scanner;
public class Q2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a<b){
           System.out.println("Smallest num:"+a);
        }
    
        else{
            System.out.println("Greatest num:"+b);
        }
    }}
