package designPrinciple.ocp;

public class Circle2 implements Shape{
    private double radius;

    public Circle2(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

}
