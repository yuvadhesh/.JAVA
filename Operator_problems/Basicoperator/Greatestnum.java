import java .util.Scanner;
public class Greatestnum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
       System.out.print((a>b)?(a<c)?a:b:c);
        }
    }
