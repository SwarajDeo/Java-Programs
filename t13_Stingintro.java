package learnJava;
import java.util.Scanner;

public class t13_Stingintro {
    public static void main(String[] args) {

        // Way 1 to use string
        String name = new String("Swaraj");
        System.out.println(name);

        // Way 2 to use string
        String name2;
        name2 = new String("Abhiraj");
        System.out.println(name2);

        // Way 3 only in JAVA
        String name3 = "Best";
        System.out.println(name3);

        // Some Example to use of String

        System.out.print("My name is ");
        System.out.println(name);

        // printf in JAVA-
        int a =2;
        System.out.println("Using printf in JAVA");
        System.out.printf("Value of a is %d\n",a);

        // Scanner and String-->
        System.out.println("Using Scanner and String");
        System.out.println("Enter the string value");

        Scanner sc2 = new Scanner(System.in);
        String st = sc2.nextLine();
        System.out.printf("The value entered is %s ",st);



    }
}
