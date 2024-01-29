package org.module2danielwang.problem2;
import java.util.*;

public class Deck {
        List<Cards> cardsList = new ArrayList<>();
        LinkedList<Cards> cardsList2 = new LinkedList<>();
        List<Cards> hand = new ArrayList<>();
        public List<Cards> createDeck() {
            for (int i = 1; i <= 13; i++) {
                cardsList.add(new Cards(Suits.CLUBS, i));
                cardsList.add(new Cards(Suits.SPADES, i));
                cardsList.add(new Cards(Suits.DIAMONDS, i));
                cardsList.add(new Cards(Suits.HEARTS, i));
            }
            cardsList2 = new LinkedList<>(cardsList);
            return cardsList;
        }
        public void printDeck(){
            Iterator<Cards> iterator = cardsList.iterator();
            while (iterator.hasNext()) {
                Cards cards = iterator.next();
                System.out.println(cards);
            }
        }
        public List<Cards> pollHand(){
            for (int i = 0; i < 7; i++){
                hand.add(cardsList2.pollFirst());
            }
            return hand;
        }
        public void shuffleDeck(){
            Collections.shuffle(cardsList);
            cardsList2 = new LinkedList<>(cardsList);
        }
            public void printHand(){
                System.out.println(hand);
            }

        }


