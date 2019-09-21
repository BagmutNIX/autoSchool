package figure;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        //Triangle.tSquare();
        //Square.sSquare();
        //Circle.cArea();
        Circle circle = new Circle();
        circle.whatAmI();
        // final double size = circle.size();
        circle.area();
        ArrayList<Figure> figures = new ArrayList<>();
        Figure figure = new Circle(10);
    }

    public static void main(ArrayList<Figure> figures) throws IOException {
        for (Figure figure : figures) {
            System.out.println("Name: " + figure.name());
            System.out.println("Area: " + figure.area());
            //System.out.println();
        }
    }
}
