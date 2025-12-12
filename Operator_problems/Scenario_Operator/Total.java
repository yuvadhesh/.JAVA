import java.util.Scanner;
public class Total{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int Price=sc.nextInt();
        int total=sc.nextInt();
        int price=total/4;
        int free=total-price;
        System.out.println(free*total);
    }
}