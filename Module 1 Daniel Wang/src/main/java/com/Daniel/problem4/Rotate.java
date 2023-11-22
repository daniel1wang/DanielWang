package com.Daniel.problem4;

public interface Rotate {
    //Methods
    /**
     * Rotates shape clockwise 90 degrees
     */
    void rotate90();
    /**
     * Rotates shape clockwise 180 degrees
     */
    void rotate180();
    /**
     * Rotates shape clockwise by any specified degree
     * @param degree - number of degrees shape rotates
     */
    void rotate(double degree);
}
