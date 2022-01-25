package learnJava;

public class t27_ForEachLoop {
    public static void main(String[] args) {
        int [] marks = {98,45,79,99,80};
        System.out.println("Value of 1st element of array");
        System.out.println(marks[0]);
        System.out.println("Length of the array");
        System.out.println(marks.length);
        System.out.println("Different types of datatypes in array ");
        // Float
        float [] arr1 = {98.5f,12.2f,33.3f};
        // String
        String [] arr2 = {"Swaraj","is","learning","Java"};

        // Displaying an Array
        // Naive or very simple method
        System.out.println("Normal method to display Array");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // Using For Loop to Display
        System.out.println("Using Loop to display Array");
        for(int i = 0; i<marks.length;i++){
            System.out.println(marks[i]);
        }

        // Printing array using loop in REVERSE ORDER
        System.out.println("Printing array using FOR loop in REVERSE ORDER");
        for(int i = marks.length -1; i>=0 ; i--){
            System.out.println(marks[i]);
        }

        // FOR EACH LOOP method to display Array
        System.out.println("FOR EACH LOOP method to display Array");
        for(int element: marks){
            System.out.println(element);
        }




    }
}
