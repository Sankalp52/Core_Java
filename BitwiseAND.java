import java.util.Scanner;

public class BitwiseAND {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1=input.nextInt();
        System.out.println("enter second the number");
        int num2=input.nextInt();
        System.out.println("result is:"+(num1&num2));
    }
}
