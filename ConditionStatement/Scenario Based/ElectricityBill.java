import java.util.Scanner;
public class ElectricityBill{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int units=sc.nextInt();
        double b=0;
        if(units<=100){
            b=0;
        }
        else if(units<=300){
            b=(units-100)*5;
        }
        else {
            b=(200*5)+(units-300)*10;
        }
        if(units>500){
            b=b+(b*0.10);
        }
        System.out.println(b);
    }
}
