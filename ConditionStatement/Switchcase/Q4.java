import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int season=sc.nextInt();
        switch(season){
         case 1:case 2:case 3:case 4:
            System.out.print("Summer");
            break;
            case 5:case 6:case 7:case 8:
                System.out.print("Spring");
                break;
                case 9:case 10:case 11:case 12:
                    System.out.print("Winter");
        }
    }
}
