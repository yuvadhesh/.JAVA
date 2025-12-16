import java.util.Scanner;
public class Q11{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sqrt=(int) Math.sqrt(n);
        if(sqrt*sqrt==n){
            System.out.println("Perfect");
        } 
        else{
            System.out.println("Not");
        }
    }
}
