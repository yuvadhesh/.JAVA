import java.util.Scanner;
public class Q4{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char ch1=sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        ch1 = Character.toLowerCase(ch1);
        ch2 = Character.toLowerCase(ch2);
        if (ch1<ch2){
            for(char ch=(char)(ch1+1);ch<ch2;ch++){
                System.out.print(ch+" ");
            }
        } 
        else{
            for(char ch=(char)(ch1-1);ch>ch2;ch--){
                System.out.print(ch+" ");
            }
        }
    }
}
