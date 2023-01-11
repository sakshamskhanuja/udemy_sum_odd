public class Main {
    public static void main(String[] args) {
        // Adds all odd numbers from 1 to 100.
        System.out.println(sumOdd(1, 100));

        // Adds all odd numbers from -1 to 100.
        System.out.println(sumOdd(-1, 100));

        // Adds all odd numbers from 100 to 100.
        System.out.println(sumOdd(100, 100));

        // Adds all odd numbers from 13 to 13.
        System.out.println(sumOdd(13, 13));

        // Adds all odd numbers from 100 to -100.
        System.out.println(sumOdd(100, -100));

        // Adds all odd numbers from 100 to 1000.
        System.out.println(sumOdd(100, 1000));
    }

    /**
     * Checks if a number is odd.
     */
    public static boolean isOdd(int number) {
        // Checks for invalid value.
        if (number < 0) {
            return false;
        }

        // Checks if number is odd.
        return (number % 2 != 0);
    }

    /**
     * Adds all odd numbers between a range of numbers.
     */
    public static int sumOdd(int start, int end) {
        // Checks for invalid value.
        if (start > end || start < 0) {
            return -1;
        }

        // Stores the sum of odd numbers.
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}