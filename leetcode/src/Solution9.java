public class Solution9 {
    public static void main(String[] args) {

    }
    public boolean isPalindrome(int x) {
        boolean isPalindromeX = true;
        String leftX = String.valueOf(x);
        String rightX = String.valueOf(strReverse(String.valueOf(x)));
        if(!leftX.equals(rightX)){
            isPalindromeX = false;
        }

        return isPalindromeX;
    }

    //2. StringBuffer的reverse方法
    public static StringBuffer strReverse(String s){
        StringBuffer sb=new StringBuffer();
        sb.append(s);
        return sb.reverse();
    }

}
