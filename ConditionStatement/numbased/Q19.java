import java.util.Scanner;
public class Q19{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int a,b,c;
    a=sc.nextInt();
    b=sc.nextInt();
    c=a*b;
        if(c>0){
            System.out.print("Positive");
        }
        else{
            System.out.print("Negative");
        }
    }
}