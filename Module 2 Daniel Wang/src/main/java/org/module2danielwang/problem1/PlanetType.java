package org.module2danielwang.problem1;

public class PlanetType {
    private String typeName;

    public PlanetType(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return typeName;
    }
}
