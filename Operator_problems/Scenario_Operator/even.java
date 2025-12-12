import java .util.Scanner;
public class even{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
    if((a%2)==0){ //if(a&1==0)
        if(a%3==0){
  System.out.println("evenand 3 multiple");
    }
    else
        System.out.print("even not 3 multiple");
}
    else
        System.out.println("Odd num");
    
    }
}
