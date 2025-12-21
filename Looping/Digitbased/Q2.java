import java.util.Scanner;
public class Q2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int t=a;
        int c;
       while(t>=10){
            t/=10;
       }
        if(t%2==0){
         System.out.print("even");
            }


           else{
            System.out.print("odd");
        
    }
}
}