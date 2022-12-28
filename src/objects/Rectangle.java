package objects;

public class Rectangle {
    double length;
    double width;

    double calculatePerimeter(){
        return (2*length) + (2*width);
    }

    double calculateArea(){
        return length*width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
