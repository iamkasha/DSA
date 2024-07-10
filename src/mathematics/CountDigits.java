package mathematics;

import java.util.Scanner;

public class CountDigits {
    static int count = 1;
    public static int countDigit(int n){
        if(n/10 == 0){
            return 1;
        }
        while(n > 9){
            count++;
            n = n/10;
        }
        return count;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDigit(n));

    }

}
