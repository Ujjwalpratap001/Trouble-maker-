import java.util.Scanner;

public class HighestFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        char maxChar = ' ';
        int maxFreq = -1;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] > maxFreq) {
                maxFreq = freq[ch];
                maxChar = ch;
            }
        }
        System.out.println("Character: " + maxChar);
        System.out.println("Frequency: " + maxFreq);
    }
}
