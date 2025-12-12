import java.util.Scanner;
public class Q18{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        if(a<9){
            System.out.print("Single digit");
        }
        else if(a<99){
            System.out.print("Two digit"); 
        }
        else{
            System.out.print("Three digit");
        }
    }
}