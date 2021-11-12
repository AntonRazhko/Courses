package Home_Task_8_OOP;

public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double side1, double side2, double side3) {
        sideA = side1;
        sideB = side2;
        sideC = side3;
    }

    public Triangle() {
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double getArea() {
        return Math.sqrt(getPerimeter() * (getPerimeter() - sideA) * (getPerimeter() - sideB) * (getPerimeter() - sideC));
    }

    public double getSinAB() {
        return sideB / sideA;
    }
}
