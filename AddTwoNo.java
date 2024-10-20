import java.sql.SQLOutput;
import java.util.Scanner;
public class AddTwoNo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the first number:");
        int num1=input.nextInt();
        System.out.println("enter the second number:");
        int num2=input.nextInt();
        System.out.println("sum is:"+(num1+num2));


    }
}
