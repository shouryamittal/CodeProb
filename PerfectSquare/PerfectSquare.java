import java.util.Scanner;

public class PerfectSquare {

    boolean isPerfectSquare(int n){
        int i = 1;

        while(i*i <= n) {
            if((n/i == i) && (n%i == 0)) {
                return true;
            }
            i++;
        }
        return false;
    }

    public static void main(String ...s) {
        PerfectSquare p = new PerfectSquare();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter a number ..!!");
        int n = sc.nextInt();

        System.out.println(p.isPerfectSquare(n));
    }

}