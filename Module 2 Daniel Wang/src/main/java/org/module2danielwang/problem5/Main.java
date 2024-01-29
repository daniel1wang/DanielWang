package org.module2danielwang.problem5;

import org.module2danielwang.problem1.Planet;
import org.module2danielwang.problem1.PlanetType;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CaesarCipher cipher = new CaesarCipher();

        // Original message
        String originalMessage = "I love computer programming";
        System.out.println("Original Message: " + originalMessage);

        String encryptedMessage = cipher.encrypt(originalMessage, 25);
        System.out.println("Encrypted Message: " + encryptedMessage);

        String decryptedMessage = cipher.decrypt(encryptedMessage, 25);
        System.out.println("Decrypted Message: " + decryptedMessage);
    }
}