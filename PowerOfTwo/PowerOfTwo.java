//Given an integer, write a function to determine if it is a power of two.

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n == 1){
            return true;
        }
        if(n==0 || n%2 != 0) {
            return false;
        }
        return isPowerOfTwo(n/2);
    }
    public static void main(String[] args) {
        PowerOfTwo p = new PowerOfTwo();
        System.out.print( p.isPowerOfTwo(1024));
    }
}