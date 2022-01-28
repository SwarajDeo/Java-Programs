package learnJava;

public class t28_MultiDimensionArray {
    public static void main(String[] args) {
        // int [] marks;  // A 1-D Array
        int [][] flats;
        flats = new int [2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        int lol = flats.length;
        System.out.println("Length of array--> flat");
        System.out.println(lol);

        // Displaying 2-D array
        System.out.println("Printing a 2-D array using For Loop");

        for(int i = 0; i<flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }





    }
}
