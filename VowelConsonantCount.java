import java.util.Scanner;

public class VowelConsonantCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        int vowels = 0, consonants = 0;
        
        for (char c : str.toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) vowels++;
            else if (Character.isLetter(c)) consonants++;
        }
        
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
        sc.close();
    }
}
