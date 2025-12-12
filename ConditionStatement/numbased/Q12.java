import java.util.Scanner;
public  class Q12{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    a=a%10;
    if(((a%2)==0)&&((a%2)==0)){
        System.out.print("Even");
    }
    else{
        System.out.print("Odd");
    }
}
}
