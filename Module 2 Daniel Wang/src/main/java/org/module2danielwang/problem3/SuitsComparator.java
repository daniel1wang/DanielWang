package org.module2danielwang.problem3;
import java.util.Comparator;

public class SuitsComparator implements Comparator<Cards> {
    @Override
    public int compare(Cards suit1, Cards suit2) {
        int suit1Value = suitValue(suit1.getSuits());
        int suit2Value = suitValue(suit2.getSuits());
        if (suit1Value > suit2Value) {
            return 1;
        }else if (suit1Value < suit2Value){
            return -1;
        }
        return 0;
    }

    private int suitValue(Suits suit){
        if (suit == Suits.SPADES) {
            return 0;
        } else if (suit == Suits.HEARTS) {
            return 1;
        } else if (suit == Suits.CLUBS) {
            return 2;
        } else{
            return 3;
        }

    }
}
