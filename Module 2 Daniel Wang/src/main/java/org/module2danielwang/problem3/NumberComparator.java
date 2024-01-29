package org.module2danielwang.problem3;

import java.util.Comparator;

public class NumberComparator implements Comparator<Cards> {
    @Override
    public int compare(Cards o1, Cards o2) {
        if (o1.getNumber() > o2.getNumber()) {
            return 1;
        } else if (o1.getNumber() < o2.getNumber()){
            return -1;
        }
        return 0;
    }
}
