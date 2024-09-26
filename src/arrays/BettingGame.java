package arrays;

import java.util.Scanner;

public class BettingGame {
    static int betBalance(String result) {
        int sum = 4;
        int betAmount = 1;

        for (int i = 0; i < result.length(); i++) {
            if (sum < betAmount) {
                return -1;
            } else {

                if (result.charAt(i) == 'W') {
                    sum = sum + betAmount;
                    betAmount = 1;
                } else if (result.charAt(i) == 'L') {
                    sum = sum - betAmount;
                    betAmount *= 2;
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the result string (consisting of 'W' and 'L'): ");
        String result = scanner.nextLine();

        int finalSum = betBalance(result);

        System.out.println("Final sum: " + finalSum);

        scanner.close();
    }
}

