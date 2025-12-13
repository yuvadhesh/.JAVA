import java.util.Scanner;
public class Q6{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        switch(mark/10){
            case 1:case 2:case 3:case 4:case 5:case 6:case 7:
                if(mark>=35){
                    System.out.print("Pass");
                }
                    else{
                        System.out.print("Fail");
                    }
                break;
                default:
                    System.out.print("Fail");
                }
        
    
}}