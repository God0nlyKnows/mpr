package pl.pjatk.unit_tests;

import java.util.Arrays;

public abstract class Polygon {
    private int[] sides;

    public Polygon(int[] sides) {
        this.sides = sides;
    }

    public abstract int calculateArea();
    public int calculateCircuit(){
        int circuit = 0;
        for (int i=0; i<sides.length; i++){
            circuit+=sides[i];
        }
        return circuit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polygon polygon = (Polygon) o;
        return Arrays.equals(sides, polygon.sides);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(sides);
    }
}
