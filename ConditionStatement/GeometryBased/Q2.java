import java.util.Scanner;
public class Q2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
       if(((a*a)==((b*b)+(c*c)))||
          ((b*b)==((a*a)+(c*c)))||
          ((c*c)==((a*a)+(b*b)))){
System.out.print("Right anlge");
        }
        else {
            System.out.print("Not");
        }
    }}
