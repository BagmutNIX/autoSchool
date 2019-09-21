package figure;

import java.io.IOException;

public class Triangle extends Figure{
    private double height = 0;
    private double size1 = 0;
    private  String objectName = "Triangle";


    @Override
    public double area() {
        return 0.5 * height * size1;
    }

    @Override
    public String name() {
        return objectName;
    }

    @Override
    public double size() {
        return height;
    }

/*    public static void tSquare() throws IOException {
        double height = 15.8;
        double size1 = 20.9;
        double square = 0.5 * height * size1;
        System.out.println(square);
    }*/
}
    /*
    в этом классе:
    private String name = 'ololo';
        Triangle name = new Triangle();
        Triangle coordinates = new Triangle();

        public String getName() {
            return name;*/



/*
в другом классе:
object triangle = new Triangle();
string name = triangle->getName();

print name; // ololo*/
