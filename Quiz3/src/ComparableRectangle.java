
public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle> {

	public ComparableRectangle() {
	}

	@Override
	public int compareTo(ComparableRectangle o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Area: " + getArea();
	}
	
}
