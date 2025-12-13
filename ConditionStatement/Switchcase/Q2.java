import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        int gradeCode;
        if(marks>=90){
            gradeCode=1;
        } 
        else if(marks>=75){
            gradeCode=2;
        }
        else if(marks>=50){
            gradeCode=3;
        } 
        else {
            gradeCode=4;
        }
        switch(gradeCode){
            case 1:
                System.out.println("Grade: A");
                break;
            case 2:
                System.out.println("Grade: B");
                break;
            case 3:
                System.out.println("Grade: C");
                break;
            case 4:
                System.out.println("Fail");
                break;
        }
    }
}
