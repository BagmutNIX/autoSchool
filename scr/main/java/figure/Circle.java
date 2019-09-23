package figure;

public class Circle extends Figure {
    //конструктор нужен для инициализации объекта/класса
    private double radius;
    private String objectName = "Circle";

    public Circle() {
    }

    public Circle(double r) {
        radius = r;
    }

    public double area() {
        //double size = 16.78;
        //double square = 3.14 * size * size;
        // System.out.println(square);
        return Math.PI * radius * radius;
    }

    public String name() {
        return objectName;
    }

    public double size() {
        return radius;
    }
}
