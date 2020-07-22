package lesson8;

public class Cupboard {
    private double width;
    private double length;
    private double height;

    public Cupboard() {
    }

    public Cupboard(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cupboard{" +
                "width=" + width +
                ", length=" + length +
                ", height=" + height +
                '}';
    }
}
