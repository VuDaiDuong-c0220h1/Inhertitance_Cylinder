public class Circle {
    public double radius;
    public String color;

    public Circle(){
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Hình tròn có bán kính =" + radius
                + ", màu " + color
                + "diện tích hình tròn là: "
                + getArea();
    }
}
