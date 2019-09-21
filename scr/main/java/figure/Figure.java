package figure;

public abstract class Figure {
    public abstract double area();
    public abstract String name();
    public abstract double size();
    public void whatAmI() {
        System.out.println("I'm a figure");
    }

}
