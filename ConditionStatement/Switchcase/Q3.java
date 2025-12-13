import java.util.Scanner;
public class Q3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        switch(day){
            case 1: 
            case 7: 
                System.out.println("Weekend");
                break;
            case 2:case 3:case 4:case 5:case 6:
                System.out.println("Weekday");
                break;
            default:
                System.out.println("Invalid day number");
        }
    }
}
