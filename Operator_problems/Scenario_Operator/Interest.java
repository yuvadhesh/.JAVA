import java.util.Scanner;

public class Interest{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
       int Principle=sc.nextInt();
       int Rate=sc.nextInt();
       int Noofyears=sc.nextInt();
        int interest=((Principle*Rate*Noofyears)/100);
       System.out.print(interest);
    }
    
}
