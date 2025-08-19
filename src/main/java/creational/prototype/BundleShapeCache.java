package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class BundleShapeCache {
    private Map<String, Shape> cache = new HashMap<>();

    public BundleShapeCache() {
        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(20);
        circle.radius = 15;
        circle.setColor("red");

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(10);
        rectangle.setWidth(20);
        rectangle.setColor("blue");

        cache.put("circle", circle);
        cache.put("rectangle", rectangle);
    }

    public Shape put(String key, Shape shape) {
        cache.put(key, shape);
        return shape;
    }

    public Shape getShape(String key) {
        Shape shape = cache.get(key);
        if (shape != null) {
            return shape.clone();
        }
        return null;
    }
}
