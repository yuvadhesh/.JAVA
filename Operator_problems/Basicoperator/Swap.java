import java.util.Scanner;

public class Swap {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        char b=sc.next().charAt(0);
        char temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a+""+b);

    }
    
}
