package recursion;

public class PrintNos {

        public static void printNos(int N) {
            // Base case: if N is less than 1, do nothing
            if (N < 1) {
                return;
            }
            // Recursively call printNos with N-1
            printNos(N - 1);
            // Print the current number after the recursive call
            System.out.println(N);
        }

        public static void main(String[] args) {
            int N = 10; // Example value for N
            printNos(N);
        }

}
