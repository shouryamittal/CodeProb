
/**Write a function that reverses a string. The input string is given as an array of characters char[].
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory. */
public class RevString {
    public void reverseString(char[] s) {
        int j = s.length - 1;
        for(int i = 0; i < s.length / 2; i++){
            if(s[i] != s[j]) {
                char temp = s[i];
                s[i] = s[j];
                s[j] = temp;
            }
            j--;
        }
    }
    public static void main(String[] args) {
        RevString r = new RevString();
        char arr[] = {'H','a','n','n','a'};
        r.reverseString(arr);
        for(char c: arr) {
            System.out.print(c+" ");
        }
    }
}