package mathematics;

import java.util.Scanner;

public class PalindromeNumber {
    public static Boolean isPalindrome(int n){

        int reverse = 0;
        int temp = n;
        while(temp !=0){
            reverse = reverse * 10 + (temp%10);
            temp = temp/10;
        }
        return n == reverse;
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));

    }
}
