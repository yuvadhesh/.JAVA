import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       char ch=sc.next().charAt(0);
        if(ch>='a'&&ch<='z'){
            System.out.print("Alphabet");
        }
       else{
        System.out.print("Not");
       }
    }
}