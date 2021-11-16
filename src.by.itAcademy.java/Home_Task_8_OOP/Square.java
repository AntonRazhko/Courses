package Home_Task_8_OOP;

public class Square extends Figure {
    private double sideSquare;

    public Square(double side) {
        sideSquare = side;
    }

    public Square() {
    }

    public double getSideSquare() {
        return sideSquare;
    }

    public void setSideSquare(double sideSquare) {
        this.sideSquare = sideSquare;
    }

    public double getDiagonal() {
        return Math.sqrt(2) * sideSquare;
    }

    @Override
    public double getPerimeter() {
        return sideSquare * 4;
    }

    @Override
    public double getArea() {
        return sideSquare * sideSquare;
    }
}
