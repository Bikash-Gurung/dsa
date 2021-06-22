package datastructures.linear;

public class JavaString {
    static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start <= end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
//        String str = "madam";
        String str = "jenkins";
        System.out.println(isPalindrome(str));
    }
}
