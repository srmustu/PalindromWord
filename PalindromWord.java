import java.util.Scanner;

public class PalindromWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan kelimeyi al
        System.out.print("Bir kelime giriniz: ");
        String word = scanner.nextLine();

        // Kelimenin palindromik olup olmadığını kontrol et
        if (isPalindrome(word)) {
            System.out.println(word + " palindromik bir kelimedir.");
        } else {
            System.out.println(word + " palindromik bir kelime değildir.");
        }
    }

    // Bir kelimenin palindromik olup olmadığını kontrol eden metot
    public static boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
    
}
