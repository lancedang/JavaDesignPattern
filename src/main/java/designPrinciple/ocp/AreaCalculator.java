package designPrinciple.ocp;

public class AreaCalculator {

    public double calculateAreaSize(Rectangle[] rectangles) {

        double areaSize = 0;

        for (Rectangle rectangle : rectangles) {
            areaSize += rectangle.calculateArea();
        }

        return areaSize;

    }

    public double calculateAreaSize(Object[] rectangles) {

        double areaSize = 0;

        for (Object object : rectangles) {
            if(object instanceof Rectangle) {
                areaSize += ((Rectangle)object).calculateArea();
            }else if (object instanceof  Circle) {
                areaSize += ((Circle)object).calculateArea();
            }
        }

        return areaSize;

    }

}
