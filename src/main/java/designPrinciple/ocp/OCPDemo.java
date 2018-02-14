package designPrinciple.ocp;

public class OCPDemo {

    public static void main(String[] args) {

        Rectangle[] rectangles = {new Rectangle(1, 2), new Rectangle(2, 3)};
        Circle[] circles = {new Circle(1), new Circle(2)};

        Object[] objects = {new Rectangle(1, 2), new Rectangle(2, 3), new Circle(1), new Circle(2)};

        AreaCalculator calculator = new AreaCalculator();


        double size = calculator.calculateAreaSize(objects);
        System.out.println("size: " + size);

    }
}
