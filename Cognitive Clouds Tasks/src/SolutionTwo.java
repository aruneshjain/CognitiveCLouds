//2. Find the vowels and consonants in a word/sentence

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SolutionTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        Set vowel = new HashSet();
        Set consonant = new HashSet();

        for(int i=0; i < line.length(); i++)
        {
            char ch = line.charAt(i);
            // checking if character is any of a, e, i, o, u
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowel.add(ch);

            // checking if character is in between a to z
            else if ((ch >= 'a' && ch <= 'z'))
                consonant.add(ch);
        }
        System.out.println("Vowels : " + vowel);
        System.out.println("Consonants : " + consonant);

    }
}
