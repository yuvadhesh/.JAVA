import java.util.Scanner;
public class Q13{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>0){
            System.out.print("Positive");
        }
         else if(a<0){
            System.out.print("Negative");
    }
        else{
            System.out.print("Zero");
        }
    }

}