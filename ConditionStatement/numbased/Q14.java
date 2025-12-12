import java.util.Scanner;
public class Q14{public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
       // a=a/3;
       // b=b/5;
        if(((a%3)==0)&& ((a%5)==0)){
            System.out.print("Divisible by both");
        }
        else{
            System.out.print("not");
        }
    }

}