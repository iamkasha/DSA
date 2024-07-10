import java.util.Scanner;

public class SumUsingRecursion {
    public int sum(int n){
        if(n == 0){
            return n;
        }
        return n + sum(n-1);
    }

    public static void main(String[] args){
        SumUsingRecursion s = new SumUsingRecursion();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(s.sum(n));
    }
}




