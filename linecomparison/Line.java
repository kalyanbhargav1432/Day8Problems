package linecomparison;

public class Line {
	Point p1, p2, p3, p4;

	public double getLength() {
		return (double) Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
	}

	public double getCalculateLength() {
		return (double) Math.sqrt(Math.pow(p3.x - p4.x, 2) + Math.pow(p3.y - p4.y, 2));
	}
}
