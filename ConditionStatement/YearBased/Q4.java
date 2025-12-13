import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
       a=a%10;
        b=b%10;
    if(a==b) {
            System.out.println("Same year");
        }else{
            System.out.println("Not");
        }
    }
}
 
    

