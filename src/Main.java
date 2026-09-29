import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        /*int result = factorial(5);
        System.out.println("Factorial: " + result );
*/

        // Array 1)

        /*Integer[] arr = {5, 2, 9, 1, 7, 3};

        Arrays.sort(arr);
        System.out.println("Increase: " + Arrays.toString(arr));

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Decrease: " + Arrays.toString(arr));
*/
        // 2)

        // 3)

        /*int[] arr = {5, 2, 9, 4, 7, 6, 1, 8};

        int count = 0;
        for (int x : arr) {
            if (x % 2 == 0) count++;
        }

        int[] evenNum = new int[count];
        int index = 0;
        for (int x : arr) {
            if (x % 2 == 0) {
                evenNum[index++] = x;
            }
        }

        System.out.println("Result: " + Arrays.toString(evenNum));*/

        // 4)

        // 5)





    }

        //1

    public static int factorial(int n) {
        if (n < 0) {
            System.out.println("Error");
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
        }

        //2

        public static int[] fibo (int n)
        {
            if(n<0)
            {
                System.out.println("Error");
            }

            int[] result = new int[n];

            for (int i = 0; i<n; i++  )
            {
                if (n==0)
                {
                    result [i] = 0;
                }
                else if (i == 1)
                {
                    result [i] = 1;
                }
                else
                {
                    result [i] = result [i - 1] + result [i - 2];
                }


            }
            return result ;


        }

        //3

        public static boolean prime (int n)
        {
            if (n<2) return false;

            for(int i = 2; i * i < n; i++)
            {
                if (n % i == 0) return false;
            }
            return true;


        }

        //4


    public static boolean isPalindrome(String s) {
        String word = s.toLowerCase();
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

        //5

    public static int digitSum(int n) {
        n = Math.abs(n);
        int sum = 0;
        if (n<=0) System.out.println("Error");

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }


    //6

    public static int power(int num, int exponent) {
        if (exponent < 0) {
            System.out.println("error");
        }
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= num;
        }
        return result;
    }

    //7

    //8

    public static int digitCount(int n) {
        int m = Math.abs((int) n);
        if (m == 0) {
            return 1;
        }
        int count = 0;
        while (m > 0) {
            count++;
            m /= 10;
        }
        return count;
    }








}