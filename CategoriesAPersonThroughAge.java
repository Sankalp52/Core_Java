import java.util.Scanner;

public class CategoriesAPersonThroughAge {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your age:");
        int age=input.nextInt();
        if(age<=13){
            System.out.println("child age");
        } else if (age<=20) {
            System.out.println("teen age");
        } else if (age<=60) {
            System.out.println("adult");
        }else{
            System.out.println("senior");
        }
    }
}
