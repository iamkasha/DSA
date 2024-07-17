package recursion;

import java.util.Scanner;

public class MaxCuts {

    public static int maxCuts(int n, int a, int b, int c){

        if(n <= -1) return -1;

        if(n == 0) return 0;

        int res = Math.max(maxCuts(n-a, a, b, c), Math.max(maxCuts(n-b, a, b, c), maxCuts(n-c, a, b, c)));

        if(res == -1) return -1;

        return res + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Max no of cuts possible: " + maxCuts(n, a, b, c));

    }
}
