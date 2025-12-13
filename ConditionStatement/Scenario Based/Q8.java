import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int storedPin=1234;   
        double balance=5000; 
        System.out.print("Enter ATM PIN: ");
        int enteredPin=sc.nextInt();
        if(enteredPin==storedPin){
            System.out.println("PIN Verified");
            System.out.print("Enter withdrawal amount: ");
            double amount=sc.nextDouble();
            if(amount>0&&amount<=balance) {
                balance-=amount;
                System.out.println("Please collect your cash");
                System.out.println("Remaining Balance: " + balance);
            } 
            else{
                System.out.println("Invalid amount or insufficient balance");
            }
        } 
        else{
            System.out.println("Incorrect PIN. Access Denied");
        }
    }
}
