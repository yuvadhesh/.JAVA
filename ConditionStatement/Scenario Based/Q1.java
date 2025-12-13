import java.util.Scanner;
public class Q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Bill Amount: ");
        double bill = sc.nextDouble();
        double discount=0;
        if(bill>=5000){
            discount=0.20*bill;
        } else if(bill>=3000) {
            discount=0.10*bill;
        } else if(bill>=1000) {
            discount=0.05*bill;
        } else{
            discount=0;
        }
        double finalAmount=bill-discount;
        System.out.println("Bill Amount: " +bill);
        System.out.println("Discount: " +discount);
        System.out.println("Final Amount to Pay: " +finalAmount);
    }
}
