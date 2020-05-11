import java.util.Scanner;

public class PerfectSquare {
    //this function is better than the other as it only considers half of the numbers.
    // Mistake I made : mid * mid could be long but I used int rather to get mid*mid into res.
    //Hence I got an error.
    //Solution: Always first consider the big picture.
    boolean findPerfectSquare(int n) {
        int beg = 1;
        int end = n;
        int mid = 0;
        while(beg <= end) {
            mid = (beg + end)/2;
            long res = (long)mid*mid;
            if(res == n) {return true;}
            else if(res < n) {
                beg = mid + 1;
            }
            else {
                end = mid -1;
            }
        }
        
        return false;
    }

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