package creational.Prototype;

import java.util.Objects;

public abstract class Shape {
    private int x;
    private int y;
    private String color;

    protected Shape() {
    }

    protected Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    protected abstract Shape clone();
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Shape)) {
            return false;
        }
        Shape shape2 = (Shape) obj;
        return this.x == shape2.x && this.y == shape2.y && Objects.equals(shape2.color, this.color);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + x + y + (color != null ? color.hashCode() : 0);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
