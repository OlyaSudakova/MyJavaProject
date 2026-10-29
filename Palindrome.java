public class Palindrome {
    public static void main(String[] args) {
        String word = "шалаш";
        String reversed = new StringBuilder(word).reverse().toString();
        if (word.equals(reversed)) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это не палиндром");
        }
    }
}
