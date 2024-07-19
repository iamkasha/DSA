package recursion;

import java.util.ArrayList;
import java.util.Collections;

class LexSort {
    static ArrayList<String> powerSet(String s) {
        ArrayList<String> result = new ArrayList<>();
        generatePowerSet(s, 0, "", result);
        Collections.sort(result);
        return result;
    }
    static void generatePowerSet(String s, int index, String current, ArrayList<String> result) {
        if (index == s.length()) {
            result.add(current);
            return;
        }
        generatePowerSet(s, index + 1, current + s.charAt(index), result);
        generatePowerSet(s, index + 1, current, result);
    }
    public static void main(String[] args) {
        String s = "abc";
        ArrayList<String> powerSet = powerSet(s);
        System.out.println(powerSet);
    }
}
