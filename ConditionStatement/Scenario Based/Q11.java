import java.util.Scanner;
public class Q11{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double amount=sc.nextDouble();
        double discount=0;
        if(amount>=5000){
            discount=amount*0.20;
        } 
        else if(amount>=3000){
            discount=amount*0.10;
        } 
        else if(amount>=1000){
            discount=amount*0.05;
        } 
        else{
            discount=0;
        }
        double finalAmount=amount-discount;
        System.out.println("Purchase"+amount);
        System.out.println("Discount"+discount);
        System.out.println("Amount"+finalAmount);
    }
}
