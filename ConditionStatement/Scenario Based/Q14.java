import java.util.Scanner;
public class Q14{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        int price;
        if(age<12){
            price=50;
            System.out.println("Child 50");
        }
         else if(age<60){
            price=100;
            System.out.println("Adult 100");
        } 
        else{
            price=70;
            System.out.println("Senior 70");
        }
        System.out.println(price);
    }
}
