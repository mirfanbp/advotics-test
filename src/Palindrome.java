public class Palindrome {
    public static void main(String[] args) {
        String word = "abba";
        String word2 = "hello";
        System.out.println(word + " is Palindrome: " + isPalindrome(word));
        System.out.println(word + " is Palindrome: " + isPalindrome(word2));
    }

    private static boolean isPalindrome(String word) {
        String wordReverse = new StringBuilder(word).reverse().toString();
        return word.equals(wordReverse);
    }
}
