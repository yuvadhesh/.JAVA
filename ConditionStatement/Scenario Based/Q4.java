import java.util.Scanner;
public class Q4{
    public static void main(String[]aargs){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<=100 && a>50){
            System.out.print("Full");
        }
        else if(a<=50&&a<40){
            System.out.print("Medium");
        }
        else{
            System.out.print("Low");
        }
    }
}   