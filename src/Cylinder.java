public class Cylinder extends Circle {
    public double height;

    public Cylinder() {
    }

    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }

    public double getVolume(){
        double area = super.getArea();
        return area * this.height;
    }

    @Override
    public String toString() {
        return "Hình trụ có chiều cao = " + height
                + ", mặt đáy "
                + super.toString();

    }
}
