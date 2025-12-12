import java.util.Scanner;

public class Candies{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int Candies=sc.nextInt();
        int People=sc.nextInt();
       int candiesperson=Candies/People;
       System.out.print(candiesperson);
    }
    
}
