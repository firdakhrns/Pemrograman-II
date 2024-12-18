package soal1;

public class Paint {
	private double coverage;

    public Paint(double c) {
        this.coverage = c;
    }
    
    public void setCover(double coverage) {
        this.coverage = coverage;
    }

    public double getCover() {
        return this.coverage;
    }

    public double amount(Shape s) {
        System.out.println("Computing amount for " + s);
        return s.area() / coverage;
    }
}