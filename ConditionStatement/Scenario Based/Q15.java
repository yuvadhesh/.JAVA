import java.util.Scanner;
public class Q15{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int speed=sc.nextInt();
        if (speed>100){
            System.out.println("Speed");
        } 
        else{
            System.out.println("Limit");
        }
    }
}
