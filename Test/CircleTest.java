import com.example.circle.Circle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CircleTest {

    @Test
    public void createCircle_withTen() {
        Circle circle = new Circle(10);
        double result = circle.getRadius();
        Assertions.assertEquals(10.0, result);
    }

    @Test
    public void setRadius_whenZero() {
        Circle circle = new Circle(10);
        circle.setRadius(0);
        double result = circle.getRadius();
        Assertions.assertEquals(0, result);
    }

    @Test
    public void setRadius_whenTwo() {
        Circle circle = new Circle(10);
        circle.setRadius(2.55);
        double result = circle.getRadius();
        Assertions.assertEquals(2.55, result);
    }

    @Test
    public void setRadius_whenNegative() {
        Circle circle = new Circle(10);
        circle.setRadius(-2.55);
        double result = circle.getRadius();
        Assertions.assertEquals(0, result);
    }

    @Test
    public void getArea_whenZero() {
        Circle circle = new Circle(0);
        double result = circle.getArea();
        Assertions.assertEquals(0, result);
    }

    @Test
    public void getArea_whenTwo() {
        Circle circle = new Circle(2);
        double result = circle.getArea();
        Assertions.assertEquals(Math.PI * 4, result);
    }

    @Test
    public void getArea_whenNegative() {
        Circle circle = new Circle(-2.55);
        double result = circle.getArea();
        Assertions.assertEquals(0, result);
    }

    @Test
    public void getAreaByRadius_whenTwo() {
        Circle circle = new Circle(10);
        double result = circle.getAreaByRadius(0);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void getAreaByRadius_whenZero() {
        Circle circle = new Circle(10);
        double result = circle.getAreaByRadius(2);
        Assertions.assertEquals(Math.PI * 4, result);
    }

    @Test
    public void getAreaByRadius_whenNegative() {
        Circle circle = new Circle(10);
        double result = circle.getAreaByRadius(-2.55);
        Assertions.assertEquals(0, result);
    }


}
