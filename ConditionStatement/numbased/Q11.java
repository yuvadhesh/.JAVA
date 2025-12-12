import java.util.Scanner;
public class Q11{
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    a=a/100;
    if(((a&1)==0)&&((a&1)==0)){
        System.out.print("Even");
    }
    else{
        System.out.print("Odd");
    }
}
}