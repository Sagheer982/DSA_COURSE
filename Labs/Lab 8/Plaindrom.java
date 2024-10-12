public class Plaindrom {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("racecar");
        System.out.println(isPalindrome("racecar"));
        System.out.println("hello");// Output: true
        System.out.println(isPalindrome("hello"));    // Output: }

}}
