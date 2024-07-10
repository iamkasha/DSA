import java.util.Arrays;

public class LongestCommonPrefix {
        public static String longestCommonPrefix(String[] strs) {

            StringBuilder sb = new StringBuilder();
            Arrays.sort(strs);

            String firstStr = strs[0];
            String lastStr = strs[strs.length-1];

            for(int i=0; i<Math.min(firstStr.length(), lastStr.length()); i++){
                if(firstStr.charAt(i) != lastStr.charAt(i)){
                    break;
                }
                sb.append(firstStr.charAt(i));
            }
            return sb.toString();
        }

    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }
}
