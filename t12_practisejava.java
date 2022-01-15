package learnJava;
import java.util.Scanner;

public class t12_practisejava {
    public static void main(String[] args) {
        //float a = 7/4 * 9/2;
        // Will give ans 4
        float a = 7 / 4.0f * 9 / 2.0f;
        System.out.println(a);


// Program to add 2 to grade
        System.out.println("Program to print grade by adding");
        System.out.println("Enter the grade in ALPHABET in CAPITAL ");
        Scanner Sc = new Scanner(System.in);
        char g = Sc.next().charAt(0);
        g = (char)(g + 2);
        System.out.println("You have entered " +g);

    }
}
