package learnJava;

public class t7_OperatorsAndExprsn {
    public static void main(String[] args) {

        // Modulo operator
        int a = 6;
        int c = a%5;
        System.out.println("Modulo used");
        System.out.println(c);
        // 4.8%1.1 --> Returns Decimal Remainder

        // Assignment operators
        int b = 9;
        b *= 3;
        System.out.println("Assignment operator used");
        System.out.println(b);

        // Comparison Operator
        System.out.println("Using comparison operator");
        System.out.println(6==7);
        System.out.println(6>-1);

        // Logical Operator
        System.out.println("Using Logical Operator");
        // Both condn should be true--> For true output
        System.out.println(64>61 && 1<2);
        System.out.println("Using logical OR operator");
        // At least one true for True output
        System.out.println(69>60 || 1>3);

        // Bitwise Operator
        System.out.println("Using bitwise Operator");
        System.out.println(2&3);
        // In binary 2-->10,3-->11 dono ka &--> 10(in boolean) jo ki
        // in number --> 2 . So output --> 2

    }
}
