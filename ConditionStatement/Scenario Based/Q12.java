import java.util.Scanner;
public class Q12{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        if(T<15){
            System.out.println("Cold");
        }
         else if(T<25){
            System.out.println("Pleasant");
        }
         else if(T<35){
            System.out.println("Hot");
        } 
        else{
            System.out.println("Heatwave");
        }
    }
}
