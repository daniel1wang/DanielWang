package org.module2danielwang.problem5;

import java.util.ArrayList;
import java.util.List;

/**
 * The CaesarCipher class provides methods for encrypting and decrypting a message
 * using Caesar cipher algorithm.
 */
public class CaesarCipher {
    /**
     * Represents alphabet used for the Caesar cipher.
     */
    private static final List<Character> CAESAR_ALPHABET = createAlphabet();

    /**
     * Represents number of positions to shift in the Caesar cipher.
     */
    private int shift;

    /**
     * Creates alphabet.
     *
     * @return List of characters in alphabet.
     */
    private static List<Character> createAlphabet() {
        List<Character> alphabet = new ArrayList<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabet.add(ch);
        }
        return alphabet;
    }

    /**
     * Encrypts a given message using Caesar cipher.
     *
     * @param message Message to be encrypted.
     * @param shift   Number of positions to shift in the Caesar cipher.
     * @return Encrypted message.
     */
    public String encrypt(String message, int shift) {
        char[] letters = message.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            char ch = letters[i];
            if (Character.isLetter(ch)) {
                // Convert character to lowercase
                char originalChar = Character.toLowerCase(ch);
                // Calculate the new index after shifting
                int newIndex = (CAESAR_ALPHABET.indexOf(originalChar) + shift) % 26;
                // Update the character with the encrypted one
                letters[i] = (ch >= 'a' && ch <= 'z') ? CAESAR_ALPHABET.get(newIndex) : Character.toUpperCase(CAESAR_ALPHABET.get(newIndex));
            }
        }
        return String.valueOf(letters);
    }

    /**
     * Decrypts a given message using the Caesar cipher.
     *
     * @param message Message to be decrypted.
     * @param shift   Number of positions to shift in the opposite direction.
     * @return Decrypted message.
     */
    public String decrypt(String message, int shift) {
        char[] letters = message.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            char ch = letters[i];
            if (Character.isLetter(ch)) {
                // Convert character to lowercase for indexing
                char originalChar = Character.toLowerCase(ch);
                // Calculate the new index after shifting in the opposite direction
                int newIndex = (CAESAR_ALPHABET.indexOf(originalChar) - shift + 26) % 26;
                // Update the character with the decrypted one
                letters[i] = (ch >= 'a' && ch <= 'z') ? CAESAR_ALPHABET.get(newIndex) : Character.toUpperCase(CAESAR_ALPHABET.get(newIndex));
            }
        }
        return String.valueOf(letters);
    }
}
