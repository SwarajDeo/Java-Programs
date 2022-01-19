package learnJava;
import java.util.Scanner;

public class HW_t19_SwitchAndConditionals {
    public static void main(String[] args) {

        // Q1 --> Easy hai --> "I am not" ---> is the answer

        //Q2 --> Fail or pass program with conditions
        // PASS--> 33% in each and 40% overall else FAIL

        Scanner Sc = new Scanner(System.in);
        System.out.println("Program to decide whether a student is PASS OR FAIL ");
        System.out.println("Enter the marks in subject 1");
        int sub1 = Sc.nextInt();
        System.out.println("Enter the marks in subject 1");
        int sub2 = Sc.nextInt();
        System.out.println("Enter the marks in subject 1");
        int sub3 = Sc.nextInt();

        float percentage = (sub1 + sub2 + sub3)*(100)/(300) ;

        if(percentage < 40){
            System.out.println("Try next time you will bounce back");
        }
        else if(sub1 >=33 && sub2 >=33 && sub3 >= 33){
            System.out.println("You are PASS!!");
        }


        // Q3-->








    }

}
