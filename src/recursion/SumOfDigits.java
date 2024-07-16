package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfDigits {
    public static int sumDigits(int num){
       if(num == 0){
           return 0;
       }
       return num%10 + sumDigits(num/10);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        System.out.println("The sum of the digits is: " + sumDigits(num));
    }
}
