package pl.pjatk.unit_tests;

public class Rectangle extends Polygon {
    protected int a,b;
    public Rectangle(int a, int b) {
        super(new int[]{a,a,b,b});
        this.a=a;
        this.b=b;
    }

    @Override
    public int calculateArea() {
        return a*b;
    }
}
