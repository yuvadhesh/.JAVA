import java.util.Scanner;
public class Q16{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
         if(i==1){
            System.out.print("*");
         }  
         else{
            System.out.print(" ");
         }
         System.out.println("");
        }
    }
}