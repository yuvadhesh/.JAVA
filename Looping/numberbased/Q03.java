import java.util.Scanner; 
public class Q03{
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n,count=0;
     n=sc.nextInt();
     if(n==0){
         count=1;
     }
     else{
        while(n!=0){
            count++;
            n=n/10;
        }
        
     }
     System.out.print(count);
    }
}