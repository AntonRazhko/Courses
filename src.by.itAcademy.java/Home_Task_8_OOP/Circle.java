package Home_Task_8_OOP;

public class Circle extends Figure {
    private double radius;

    public Circle(double radiusCircle) {
        radius = radiusCircle;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double getArea() {
        return radius * radius * 3.14;
    }

    public double getDiameter() {
        return radius + radius;
    }

}
