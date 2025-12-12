import java.util.Scanner;

public class Salaryofemp{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
       int Salary=sc.nextInt();
       double TotalSalary=Salary-((((0.05)*Salary)+(0.08)*Salary));
       System.out.print(TotalSalary);
    }
    
}
