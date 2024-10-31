package com.harry;

public class PracticeSet4 {
    public static void main(String[] args) {

          //Problem 1
            float [] m = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
            float sum = 0;
            for(float element:m){
            sum = sum + element;
            }
            System.out.println("The value of sum is " + sum);

          //Problem 2
            float [] J = {24.8f,5.59f,78.48f,46.58f,98.78f};
            float num = 45.57f;
            boolean isInArray = false;
            for(float element:J){
            if(num==element){
                isInArray = true;
                break;
                }
            }
            if(isInArray){
            System.out.println("The value is present in the array");
            }
            else{
            System.out.println("The value is not present in the array");
            }

          //Problem 3
            int [] ma = {45, 67, 63, 99, 100};
            float s = 0;
            for(int element:ma){
            s = s + element;
             }
            System.out.println("The value of average Marks is " + s/ma.length);

          //Problem 4
            int [][] mat1 = {{1, 2, 3},
                             {4, 5, 6}};
            int [][] mat2 = {{2, 6, 13},
                             {3, 7, 1}};
            int [][] result = {{0, 0, 0},
                               {0, 0, 0}};

            for (int i=0;i<mat1.length;i++){ // row number of times
                for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
                }
            }
                 // Printing the elements of a 2-D Array
            for (int i=0;i<mat1.length;i++){ // row number of times
                for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.print(result[i][j] + " ");
                }
                System.out.println(""); // Prints a new line
            }

          //Problem 5
            int [] arr = {1, 21, 3, 4, 5, 34, 67};
            int l = arr.length;
            int n = Math.floorDiv(l, 2);// 5/2=2 & 4/2=2 is  work of floorDiv
            int temp;

            for(int i=0; i<n; i++){
            // Swap a[i] and a[l-1-i]
            // a   b   temp
            // |4| |3| ||
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
            }

            for(int element: arr){
            System.out.print(element + " ");
            }

          //Problem 6
            int [] ar = {1, 611, 38, 4, 95, 37, 67};
            int max = 0;
            for (int e: ar){
                if (e>max) {
                    max = e;
                }
            }
             System.out.println("\nThe value of the maximum element in this array is: "+ max);

          //Problem 7
            int [] ar1 = {18, 611, 38, 4, 95, 37, 67};
            int min = Integer.MAX_VALUE;//for maximum value of Integer
            for (int f: ar1){
            if (f<min) {
                min = f;
                }
            }
            System.out.println("\nThe value of the maximum element in this array is: "+ min);

          //Problem 8
            boolean isSorted = true;
            int [] a = {1, 2, 3, 4, 5, 34, 67};
            for(int i=0;i<a.length-1;i++){
            if(a[i] > a[i+1]){
                isSorted = false;
                break;
                }
            }
            if(isSorted){
            System.out.println("The Array is sorted");
            }
            else{
            System.out.println("The Array is not sorted");
            }


    }
}
