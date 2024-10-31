package DSA;
import java.util.Scanner;

public class Sorting {
    //Create an Array
    static int[] create() {
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

    // Print an Array
    static void print(int[] a){
        System.out.println("The elements of the array are:");
        for (int j : a) {
            System.out.print(j + " ");
        }
    }

    //Selection Sort
    static int[] selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<=n-2;i++){
            int min = i;
            for(int j=i;j<=n-1;j++){
                if (arr[j]<arr[min]) min = j;
            }
            //swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i]= temp;
        }
        return arr;
    }
    
    //Bubble Sort
    static int[] bubbleSort(int[] arr){
        int n = arr.length;
        for (int i=n-1;i>=1;i--){
            for (int j=0;j<i;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]= temp;
                }
            }
        }
        return arr;
    }

    //Insertion Sort
    static int[] insertionSort(int[] arr){
        int n = arr.length;
        for(int i =0;i<=n-1;i++){
            int j = i;
            while ( j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j]= temp;
                j--;
            }
        }
        return arr;
    }

    //Merge Sort
    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < left.length) {
            array[k++] = left[i++];
        }

        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
    static int[] mergeSort(int[] arr){
        if (arr.length<2){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);

        return arr;
    }

    //Quick Sort
    private static int partition(int[] array, int low, int high) {
            int pivot = array[high];
            int i = low - 1; // Index of smaller element

            for (int j = low; j < high; j++) {
                // If the current element is smaller than the pivot
                if (array[j] < pivot) {
                    i++;
                    // Swap array[i] and array[j]
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

            // Swap array[i + 1] and array[high] (or pivot)
            int temp = array[i + 1];
            array[i + 1] = array[high];
            array[high] = temp;

            return i + 1;
        }// Private helper method to perform QuickSort
        private static void quickSortHelper(int[] array, int low, int high) {
            if (low < high) {
                // Find pivot index
                int pi = partition(array, low, high);

                // Recursively sort elements before and after partition
                quickSortHelper(array, low, pi - 1);
                quickSortHelper(array, pi + 1, high);
            }
        }// Public quickSort method that takes a single argument (the array)
        public static int[] quickSort(int[] array) {
            if (array == null || array.length == 0) {
                return array;
            }
            quickSortHelper(array, 0, array.length - 1);

            return array;
        }


    public static void main(String[] args) {
            //Selection Sort
            System.out.println("Selection Sort");
              print(selectionSort(create()));

            //Bubble Sort
            System.out.println("Bubble Sort");
              print(bubbleSort(create()));

            //Insertion Sort
            System.out.println("Insertion Sort");
              print(insertionSort(create()));

            //Merge Sort
            System.out.println("Merge Sort");
              print(mergeSort(create()));

            //Quick Sort
            System.out.println("Quick Sort");
              print(quickSort(create()));
    }
}
