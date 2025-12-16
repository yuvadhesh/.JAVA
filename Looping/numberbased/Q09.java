import java.util.Scanner;
public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=2;i<a;i++){
            if(a%i==0){
                System.out.print("not");
                return;
            }
            
            
        }
        
            
                System.out.print("Prime");
    }
}
