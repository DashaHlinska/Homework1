package lesson8;

public class Chair {
    private String color;
    private double width;
    private double length;

    public Chair() {
    }

    public Chair(String color, double width, double length) {
        this.color = color;
        this.width = width;
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    @Override
    public String toString() {
        return "Chair{" +
                "color='" + color + '\'' +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}
