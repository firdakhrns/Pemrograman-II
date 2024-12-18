package soal1;

import java.text.DecimalFormat;

public class MainSoal1 {

	public static void main(String[] args) {
		final double COVERAGE = 350; // coverage in square feet per gallon
        Paint paint = new Paint(COVERAGE);

        // Instantiate shapes
        Rectangle deck = new Rectangle(20, 30);
        Sphere bigBall = new Sphere(15);
        Cylinder tank = new Cylinder(10, 30);

        // Compute amount of paint needed
        double deckAmt = paint.amount(deck);
        double ballAmt = paint.amount(bigBall);
        double tankAmt = paint.amount(tank);

        // Print results
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck: " + fmt.format(deckAmt));
        System.out.println("Big Ball: " + fmt.format(ballAmt));
        System.out.println("Tank: " + fmt.format(tankAmt));
	}
}