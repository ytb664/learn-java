public class Cuboid extends Rectangle{
    // write your code here
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height < 0 ? 0 : height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    public double getHeight() {
        return height;
    }
}