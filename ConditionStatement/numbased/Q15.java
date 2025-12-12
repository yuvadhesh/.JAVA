import java.util.Scanner;
public class Q15{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((((a%3)==0)||(a%7)==0)){
            System.out.print("Divisible by either 3 or 7");
        }
        else{
            System.out.print("Not");
        }
    }
}
