package org.module2danielwang.problem2;

import java.util.Objects;

public class Cards {
    private Suits suits;
    private int number;
    private String face;

    public Cards(Suits suits, int number) {
        this.suits = suits;
        this.number = number;
        faceNumber();
    }

    public void faceNumber() {
        if (number > 10) {
            if (number == 11) {
                face = "J";
            } else if (number == 12) {
                face = "Q";
            } else if (number == 13) {
                face = "K";
            }
        }
    }
    public boolean faceNumber(Cards card){
        return number > 10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cards card) {
            return Objects.equals(face, card.face);
        }
        return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(suits, face);
    }

    @Override
    public String toString() {
        if (face != null){
            return face + " of " + suits;
         }
        return number + " of " + suits;
        }
    }
