package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateSubsets {

    public static void generateSubset(String str, int index, String cur){

        int n = str.length();

        if(index == n){
            System.out.println(cur);
            return;
        }

        generateSubset(str, index + 1, cur + str.charAt(index));
        generateSubset(str, index+1, cur);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String cur = "";
        int index = 0;
        generateSubset(str, index, cur);
    }
}
