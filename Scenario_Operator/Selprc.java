import java.util.Scanner;

public class Selprc{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int Costprice=sc.nextInt();
        int Profit=sc.nextInt();
        int Sellingprice=Costprice+(Costprice*Profit)/100;
        System.out.print(Sellingprice);
    }
    
}
