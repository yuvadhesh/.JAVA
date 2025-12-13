import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x>0&&y>0){
            System.out.println("First Qua");
        }
        else if(x<0&&y>0){
            System.out.println("Second Qua");
        }
        else if(x<0&&y<0){
            System.out.println("Third Qua");
        }
        else if(x>0&&y<0){
            System.out.println("Fourth Qua");
        }
        else if(x==0&&y!=0){
            System.out.println("On Y-axis");
        }
        else if(y==0&&x!=0){
            System.out.println("On X-axis");
        }
        else{
            System.out.print("Origin");
        }
    }
}