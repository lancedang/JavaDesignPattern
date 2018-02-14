package designPrinciple.ocp;

public class AreaCalculator2 {

    public double calculateAreaSize(Shape[] shapes) {

        double areaSize = 0;

        for (Shape shape : shapes) {
            areaSize += shape.calculateArea();
        }

        return areaSize;

    }

}
