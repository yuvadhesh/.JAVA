import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=a/100;
        b=b%100;
    if(a==b) {
            System.out.println("Same year");
        }else{
            System.out.println("Not");
        }
    }
}
