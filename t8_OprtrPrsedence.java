package learnJava;

public class t8_OprtrPrsedence {
    public static void main(String[] args) {
        System.out.println("Using precedence");
        // BODMASS --> Not used , Precedence Order is used
        int a = 6*5 - 34/2;
        /* Steps
            = 30 - 34/2
            = 30 - 17
            = 13
         */
        System.out.println(a);
        System.out.println("See associativity");
        // as * and / have same precedence
        // we use precedence which is LEFT TO RIGHT
        int b = 60/5 - 34*2;
        /*
              = 12 - 34*2
              = 12 - 68
              =-56
         */
        System.out.println(b);
    }
}
