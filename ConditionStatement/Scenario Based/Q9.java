import java.util.Scanner;
public class Q9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double balance=10000; 
        System.out.print("Enter withdrawal amount: ");
        int amount=sc.nextInt();
        if(amount<=balance&&amount%100==0&&amount>0){
            balance-=amount;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
        } 
        else{
            System.out.println("Invalid withdrawal amount");
        }
    }
}
