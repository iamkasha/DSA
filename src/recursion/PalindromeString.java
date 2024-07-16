package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeString {

    public static boolean isPalindrome(String s, int i){
        if(i > s.length()/2)
        {
            return true ;
        }

        return s.charAt(i) == s.charAt(s.length()-i-1) && isPalindrome(s, i+1) ;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine().toLowerCase();

        if (isPalindrome(str, 0))
        { System.out.println("Yes"); }
        else
        { System.out.println("No"); }

    }

}


