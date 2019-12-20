import java.util.Scanner;

/**
 * LeetCode9：回文数
 */
public class Solution9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        boolean isPalindromeX = true;
        String leftX = String.valueOf(x);
        String rightX = String.valueOf(strReverse(String.valueOf(x)));
        if(!leftX.equals(rightX)){
            isPalindromeX = false;
        }
        return isPalindromeX;
    }

    // 字符串倒序排列方法
    // 2. StringBuffer的reverse方法
    public static StringBuffer strReverse(String s){
        StringBuffer sb=new StringBuffer();
        sb.append(s);
        return sb.reverse();
    }
}
