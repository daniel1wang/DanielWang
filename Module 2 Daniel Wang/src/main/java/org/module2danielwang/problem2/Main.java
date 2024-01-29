package org.module2danielwang.problem2;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Deck deck = new Deck();
    deck.createDeck();
    deck.shuffleDeck();
    deck.printDeck();
    deck.pollHand();
    deck.printHand();
    }
}