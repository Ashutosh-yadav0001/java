import java.util.Scanner;

public class Perfect_Square {

    public static boolean isPerfectSquare(int n) {
        if (n < 1) {
            return false;
        }

        int low = 1;
        int high = n / 2; 
        if (n == 1)
            return true; 

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long midSquared = (long) mid * mid; // Use long to avoid overflow

            if (midSquared == n) {
                return true;
            } else if (midSquared < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println(" enter the number b/w 0 to 500:");


        int number = scn.nextInt();
        if (isPerfectSquare(number)) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }
    }
}
