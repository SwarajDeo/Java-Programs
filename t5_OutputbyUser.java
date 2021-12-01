package learnJava;
import java.util.Scanner;

public class t5_OutputbyUser {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        // sc is name given to the scanner by me

        System.out.println("Enter the 1st number");
        int a = sc.nextInt();
        // the input given by the user will be stored in a
        // And it should be an integer

        System.out.println("Enter the 2nd number");
        int b = sc.nextInt();
        int sum = a + b;

        System.out.println("The sum of numbers is");
        System.out.println(sum);


    }
}
