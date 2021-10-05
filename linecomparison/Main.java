package linecomparison;

public class Main {
	public static void main(String[] args) {
		Point p1 = new Point();
		p1.x = 4;
		p1.y = 5;
		Point p2 = new Point();
		p2.x = 6;
		p2.y = 8;
		Point p3 = new Point();
		p3.x = 4;
		p3.y = 5;
		Point p4 = new Point();
		p4.x = 6;
		p4.y = 8;

		Line line = new Line();
		line.p1 = p1;
		line.p2 = p2;
		line.p3 = p3;
		line.p4 = p4;
		Double length1 = line.getLength();
		Double length2 = line.getCalculateLength();
		if (Double.compare(length1, length2) == 0) {
			System.out.println("two lengths are equal");
		}
		else if (Double.compare(length1, length2) < 0) {
			System.out.println("length1 is less than length2");
		} else
			System.out.println("length1 is greater than length2");

	}
}
