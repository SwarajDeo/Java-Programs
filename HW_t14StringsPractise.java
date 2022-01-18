package learnJava;

public class HW_t14StringsPractise {
    public static void main(String[] args) {
        // Question 1 -->
        String name = "Swaraj Deo";
        name = name.toLowerCase();
        System.out.println(name);

        // Q2- Program to replace spaces with underscore --->
        String name2 = "Hello   Everyone";
        name2 = name2.replace(" " ,"_");
        System.out.println(name2);

        // Q3- To replace a word in a line with user input
        /*
        String message = "Dear <|name|> Thanks a lot!";
        Scanner sc = new Scanner(System.in);    // Writing for using scanner
        System.out.printf("Enter the name to be in the message\n");
        String str = sc.nextLine();     // Using scanner for taking string as input
        System.out.println("You have entered " +str);
        message = message.replace("<|name|>","+str");
        System.out.println(message);
        */

        // Q4- Program to detect a double and triple spaces in a string
        String detector = "This string has  double and triple spaces";
        System.out.println("double space is at");
        System.out.println(detector.indexOf("  "));
        System.out.println("triple space is at");
        System.out.println(detector.indexOf("   "));

        // Q5- Program to format following letter using Escape sequence characters
        // letter = "Dear Harry, This Java Course is nice Thanks"

        String newformat = "Dear Harry,\nThis Java Course is Nice.\nThanks!";
        System.out.println(newformat);









    }
}
