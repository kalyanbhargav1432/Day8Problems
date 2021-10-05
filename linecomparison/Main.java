package linecomparison;

public class Main {
	public static void main(String[] args) {
		Point p1 = new Point();
		p1.x = 4;
		p1.y = 5;
		Point p2 = new Point();
		p2.x = 6;
		p2.y = 8;

		Line line = new Line();
		line.p1 = p1;
		line.p2 = p2;
		float length = line.getLength();
		System.out.println("to print the length:" + length);
	}
}
