package soal1;

public class Cylinder extends Shape{
	private double radius;
    private double height;

    public Cylinder(double r, double h) {
        super("Cylinder");
        this.radius = r;
        this.height = h;
    }
    
    public void setRad(double radius) {
        this.radius = radius;
    }

    public double getRad() {
        return this.radius;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public double area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public String toString() {
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}