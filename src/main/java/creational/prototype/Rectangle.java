package creational.prototype;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle() {
        super();
    }

    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Rectangle) || !super.equals(obj)) {
            return false;
        }
        Rectangle rectangle = (Rectangle) obj;
        return rectangle.getHeight() == this.height && rectangle.getWidth() == this.width;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + width + height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
