package pl.pjatk.test;

import org.junit.Assert;
import org.junit.Test;
import pl.pjatk.unit_tests.Polygon;
import pl.pjatk.unit_tests.Rectangle;
import pl.pjatk.unit_tests.Square;

public class PolygonTest {
    @Test
    public void squareAreaWithSide8ShouldBe64(){
        Square square = new Square(8);
        Assert.assertEquals(64, square.calculateArea());
    }

    @Test
    public void rectangleCircuitWithSide5And8ShouldBe26(){
        Rectangle rectangle = new Rectangle(5,8);
        Assert.assertEquals(26, rectangle.calculateCircuit());
    }

    @Test
    public void samePolygonsAreEquals(){
        Polygon p1 = new Square(5);
        Polygon p2 = new Square(5);
        Assert.assertEquals(p1, p2);
//        Assert.assertSame(p1, p2); --> will fail!
    }

    @Test
    public void differentPolygonsShouldNotBeEquals(){
        Polygon p1 = new Rectangle(5, 10);
        Polygon p2 = new Rectangle(10, 5);
        Assert.assertNotEquals(p1, p2);
    }
}
