package org.module2danielwang.problem3;

import java.util.Collections;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Deck deck = new Deck();
    deck.createDeck();
    deck.shuffleDeck();
    System.out.println("Shuffled Deck:");
    deck.printDeck();
    deck.sortDeckNumber();
    System.out.println("\nSorted by Number Deck:");
    deck.printDeck();
    deck.sortDeckSuits();
    System.out.println("\nSorted by Suit Deck:");
    deck.printDeck();
    deck.pollHand();
    deck.printHand();
    }
}