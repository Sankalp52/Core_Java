import java.util.Scanner;

public class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int num=input.nextInt();
        System.out.println("result is:"+(~num));
    }
}
