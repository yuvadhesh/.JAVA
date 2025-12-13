import java.util.Scanner;
public class Q17{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int usage=sc.nextInt();
        if(usage<50){
            System.out.println("Low");
        } 
        else if(usage<100){
            System.out.println("Half");
        } 
        else{
            System.out.println("Over");
        }
    }
}
