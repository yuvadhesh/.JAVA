import java.util.Scanner;
public class Q16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        int price;
        switch (day){
            case 1: 
            case 7: 
                price=150;
                System.out.println("Weekend");
                break;
            case 2: case 3: case 4: case 5: case 6:
                price=100;
                System.out.println("Weekday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
