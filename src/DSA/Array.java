package DSA;
import java.util.Scanner;

public class Array {
    //Create an Array
    static private int[] create() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int n = scn.nextInt();

        System.out.println("Enter Elements of the Array");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        return a;
    }

    //Largest Element in an Array
    static private void largestElementArray(int[] arr){
        int largest = arr[0];
        for (int i : arr) {
            if (i > largest) {
                largest = i;
            }
        }
        System.out.println("The Largest Element of an Array is: "+largest);
    }

    //Second-Largest and Second-Smallest Element in an Array without Sorting
    static private void secondLargest(int[] arr)
    {   int n = arr.length;
        if(n<2)
            return;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        for (int i :arr)
        {   if (i > large) {
            second_large = large;
                large = i;
            }
            else if (i> second_large && i != large) {
                second_large = i;
            }
        }
        System.out.println("The Largest Element in Array: "+second_large);
    }
    static private void secondSmallest(int[] arr)
    {   int n = arr.length;
        if (n < 2) {
                return;
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j < small) {
                    second_small = small;
                    small = j;
            }
            else if (j < second_small && j != small) {
                    second_small = j;
            }
        }
            System.out.println("The Second Smallest Element is: "+second_small);
    }

    //Check if the array is sorted
    static private boolean isSorted(int[] arr) {
        for (int i : arr) {
            if (i < i + 1) {
                return false;
            }
        }
        return true;
    }

    //Remove duplicates from a Sorted Array
    


    public static void main(String[] args){
        //Question 1
        largestElementArray(create());

        //Question 2
        secondLargest(create());
        secondSmallest(create());

        //Question 3
        System.out.println("The Array is Sorted: "+isSorted(create()));

        //Question 4

    }

}
