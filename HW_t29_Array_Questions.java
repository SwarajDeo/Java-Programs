package learnJava;

public class HW_t29_Array_Questions {
    public static void main(String[] args) {
        /*
        // Question 1
        float [] marks = {98.8f,11.4f,12.2f,32.5f,11,1f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.printf("Sum of element is %f ",sum);
        System.out.println("");
        // Question 2
        float [] marks2 = {45.7f,67.8f,63.2f,99.2f,100.0f};
        float num = 45.7f;
        boolean isInArray = false;
        for(float element:marks2){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in the array");
        }
        else{
            System.out.println("The value is NOT present in the array");
        }
        // Question 3-->
        // avg = sum/marks.length

        // Question 4 -->
        int [][] mat1 = {{1,2,3},
                        {4,5,6}};

    int [][] mat2 = {{2,6,13},
                    {4,13,3}};

    int [][] resultmat = {{0,0,0},
                         {0,0,0}};


    for(int i = 0; i < mat1.length ;i++){   // row number of times
        for(int j = 0; j < mat1[i].length ;j++){   // column number of times
            System.out.format("Setting value for i = %d and j = %d \n",i,j);
            resultmat[i][j] = mat1[i][j] + mat2[i][j] ;

        }
    }


        for(int i = 0; i < mat1.length ;i++){   // row number of times
            for(int j = 0; j < mat1[i].length ;j++){   // column number of times
                System.out.print(resultmat[i][j] + " ");
                resultmat[i][j] = mat1[i][j] + mat2[i][j] ;
            }
            System.out.println("");

        }
        // Program to Reverse an Array--->
        int [] arr = {1,2,7,4,5};

        System.out.println("Reversing array");
        for(int k = arr.length - 1; k>=0 ; k--){

            System.out.println(arr[k]+"");

        }

          */
        System.out.println("Method 2 for Reversing an Array");
        int [] arr2 = {1,2,3,4,5,6};
        int l = arr2.length;
        int n = Math.floorDiv(l,2);   // GIF wala concept
        int temp;
        for(int p = 0; p< n; p++ ){
            // Swap for a[i] and a[l-i-1]
            //  a      b     temp
            // | 3|    | 4|    | |  ......(1)
            // | |    | 4|    | 3|  ......(2)
            // | 4|    | |    |3|   ......(3)
            // | 4|    |3 |    | |   ---> Swapping Done of a and b ....(4)

            temp = arr2[p];         // (2) is due to this code
            arr2[p] = arr2[l-p-1];   // (3) is due to this code
            arr2[l-p-1] = temp;     // (4)  is due to this code


        }
        for(int element: arr2){
            System.out.print(element + " ");

        }
        System.out.println("");

        // Q6
        // To find the highest element in array
        int [] arr3 = {1,21,3,455,5,34,67};
        int max = 0;  // or we can take max = -2147483648
        for(int e: arr3){
            if(e>max){
                max = e;
            }

        }
        System.out.format("The value of the maximum element in the array is %d ", max );


        // Q---->8
        // To find whether an Array is sorted or not
        System.out.println("");
        System.out.println("To find whether an Array is sorted or not");
        boolean isSorted = true;
        int [] arr4 = {1,2100,3,455,5,34,67};
        for(int h = 0; h < (arr4.length - 1) ; h++){  // -1 because 67(last element wale ka pair nhi ban pataa hai)
            if(arr4[h] < arr4[h+1]){
                isSorted = false;
                break;

            }

        }
        if(isSorted){
            System.out.println("The array is Sorted");
        }
        else{
            System.out.println("The Array is NOT Sorted");
        }

    }
}
