package creational;


import creational.prototype.BundleShapeCache;
import creational.prototype.Circle;
import creational.prototype.Rectangle;
import creational.prototype.Shape;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Prototype Design Pattern Test")
class PrototypeTest {

    private BundleShapeCache shapes;

    @BeforeEach
    void setUp() {

        this.shapes = new BundleShapeCache();
    }

    @Test
    @DisplayName("Test for Prototype Pattern")
    void prototypeTest() {
        // Retrieve a circle from the cache
        Shape circ = shapes.getShape("circle");
        assert circ != null;
        Circle circle = (Circle) circ;
        assert "red".equals(circle.getColor());
        assert circle.getX() == 10;
        assert circle.getY() == 20;

        // Retrieve a rectangle from the cache
        Shape rectangle = shapes.getShape("rectangle");
        assert rectangle != null;
        assert "blue".equals(rectangle.getColor());
        Rectangle rect = (Rectangle) rectangle;
        assert rect.getHeight() == 10;
        assert rect.getWidth() == 20;

        // Clone the circle and modify its properties
        Shape clonedCircle = circle.clone();
        clonedCircle.setX(30);
        clonedCircle.setY(40);
        clonedCircle.setColor("green");

        // Verify that the original circle remains unchanged
        assert "red".equals(circle.getColor());
        assert circle.getX() == 10;
        assert circle.getY() == 20;

        // Verify that the cloned circle has modified properties
        assert "green".equals(clonedCircle.getColor());
        assert clonedCircle.getX() == 30;
        assert clonedCircle.getY() == 40;
        Assertions.assertTrue((clonedCircle instanceof Circle) && (circle instanceof Circle),
                "Both clonedCircle and circle should be instances of Circle");
    }
}
