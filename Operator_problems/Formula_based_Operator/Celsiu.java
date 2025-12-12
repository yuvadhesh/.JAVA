import java.util.Scanner;
public class Celsiu{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double celsius=sc.nextDouble();
        Double fahrenheit=((celsius*5/9)+32);
        System.out.print(fahrenheit);
    }}

