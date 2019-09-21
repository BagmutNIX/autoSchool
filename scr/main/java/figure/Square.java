package figure;

public class Square extends  Figure{
    private double size = 0;
    private  String objectName = "Triangle";

    @Override
    public double area() {
        return size * size;
    }

    @Override
    public String name() {
        return objectName;
    }

    @Override
    public double size() {
        return size;
    }
/*
    public static void sSquare() {
        double size = 12.77;
        double square = size * size;
        System.out.println(square);
    }
*/

}
