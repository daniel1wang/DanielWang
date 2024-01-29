package org.module2danielwang.problem5;
import java.util.ArrayList;
import java.util.List;

public class CaesarCipher {
    private static final List<Character> CAESAR_ALPHABET = createAlphabet();
    private int shift;

    private static List<Character> createAlphabet() {
        List<Character> alphabet = new ArrayList<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabet.add(ch);
        }
        return alphabet;
    }

    public String encrypt(String message, int shift) {
        char[] letters = message.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            char ch = letters[i];
            if (Character.isLetter(ch)) {
                char originalChar = Character.toLowerCase(ch);
                int newIndex = (CAESAR_ALPHABET.indexOf(originalChar) + shift) % 26;
                letters[i] = (ch >= 'a' && ch <= 'z') ? CAESAR_ALPHABET.get(newIndex) : Character.toUpperCase(CAESAR_ALPHABET.get(newIndex));
            }
        }
        return String.valueOf(letters);
    }

    public String decrypt(String message, int shift) {
        char[] letters = message.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            char ch = letters[i];
            if (Character.isLetter(ch)) {
                char originalChar = Character.toLowerCase(ch);
                int newIndex = (CAESAR_ALPHABET.indexOf(originalChar) - shift + 26) % 26;
                letters[i] = (ch >= 'a' && ch <= 'z') ? CAESAR_ALPHABET.get(newIndex) : Character.toUpperCase(CAESAR_ALPHABET.get(newIndex));
            }
        }
        return String.valueOf(letters);
    }
}

