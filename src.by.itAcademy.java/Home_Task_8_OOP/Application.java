package Home_Task_8_OOP;

public class Application {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        Square square1 = new Square();
        Circle circle1 = new Circle();
        Figure circle2 = new Circle();
        Figure triangle2 = new Triangle();
        Figure square2= new Square();

        circle1.getArea();
        circle1.getRadius();
        circle2.getPerimeter();// У обьекта Circle2  нет метода get Radius т.к. он типа Figure

        triangle1.getSinAB();
        triangle1.getArea();
        triangle1.getPerimeter();
        triangle2.getArea();
        triangle2.getPerimeter();

        square1.getArea();
        square1.getPerimeter();
        square1.getDiagonal();
        square2.getPerimeter();
        square2.getArea();

    }
}
