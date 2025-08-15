package creational.prototype;

public class Circle extends Shape {
    public int radius;

    public Circle() {
        super();
    }

    public Circle(Circle target) {
        super(target);
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Circle) || !super.equals(obj)) {
            return false;
        }
        Circle circle = (Circle) obj;
        return circle.getRadius() == this.getRadius();
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
