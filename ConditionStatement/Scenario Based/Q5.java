import java.util.Scanner;
public class Q5{
    public static void main(String[]aargs){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<=105 && a>=100){
            System.out.print("High fever");
        }
        else if(a>=90&&a<=99){
            System.out.print("Medium fever");
        }
        else{
            System.out.print("Low ferver");
        }
    }
}   