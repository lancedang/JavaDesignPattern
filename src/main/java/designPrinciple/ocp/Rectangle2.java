package designPrinciple.ocp;

public class Rectangle2 implements Shape{

    private double height;

    private double width;

    public Rectangle2(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double calculateArea() {
        return height * width;
    }

}
