package soal1;

public class Sphere extends Shape{
	private double radius;

    public Sphere(double r) {
        super("Sphere");
        this.radius = r;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public String toString() {
        return super.toString() + " of radius " + radius;
    }
}