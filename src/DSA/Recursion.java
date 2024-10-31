package DSA;
 class Recursion {
     // Question 1
     static void name(int n){
         int j = 0;
        if ( j==n) return;
        System.out.println("RJDP");
        name(n-1);
     }
     // Question 2
     static int i = 1;
     static void print(int n){
         if(i>=n+1) return ;
         System.out.println(i);
         i++;
         print(n);
     }
     // Question 3
     static int j = 0;
     static void p(int n){
         if(j==n) return ;
         System.out.println(n);
         p(n-1);
     }
     // Question 4
     static int t = 0;
     static void sum(int n){
         if(n==0) {
             System.out.println(t);
             return;
         }
         t = t + n;
         sum(n-1);
     }
     // Question 5
     static int factorial(int n){
         if(n==0){
             return 1;
         }
         return n * factorial(n-1);
     }
     // Question 6
     static void printArray(int a[], int n){
         for(int i =0; i<n;i++){
             System.out.println(a[i]+" ");
         }
     }
     static void reverseArray(int arr[], int start, int end){
         if (start < end) {
             int tmp = arr[start];
             arr[start] = arr[end];
             arr[end] = tmp;
             reverseArray(arr, start + 1, end - 1);
         }
     }
     // Question 7
     static boolean palindrome(String s){
         if (s.length() <= 1) {
             System.out.println("Is Palindrome");
             return true;
         }
         if (s.charAt(s.length() - 1) == s.charAt(0)) {
            return palindrome(s.substring(1, s.length() - 1));
         }
         else return false;
     }
     // Question 8
     static int fibonacci(int n){
         if(n<=1){
            return n;
         }
         return fibonacci(n-1)+fibonacci(n-2);
     }

    public static void main(String[] args) {

        System.out.println("-----------------");

        // Question 1
        name(5);
        
        System.out.println("-----------------");

        // Question 2
        print(5);

        System.out.println("-----------------");

        // Question 3
        p(5);

        System.out.println("-----------------");

        // Question 4
        sum(5);

        System.out.println("-----------------");

        // Question 5
        System.out.println(factorial(5));

        System.out.println("-----------------");

        // Question 6
        int n = 5;
        int arr [] = {1,2,3,4,5};
        reverseArray(arr, 0, n - 1);
        printArray(arr, n);

        System.out.println("-----------------");

        // Question 7
        palindrome("MADAM");

        System.out.println("-----------------");

        // Question 8
        int a = 10;
        System.out.println("Fibonacci series up to " + a + " terms:");

        for (int i = 0; i < a; i++) {
            System.out.print(fibonacci(i) + " ");
        }

    }
}
