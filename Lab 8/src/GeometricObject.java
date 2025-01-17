import java.util.Date;

public class GeometricObject {
	private String color = "white";
	private boolean filled = false;
	private java.util.Date dateCreated;
	
	public GeometricObject() {
		super();
	}

	public GeometricObject(String color, boolean filled, Date dateCreated) {
		this.color = color;
		this.filled = filled;
		this.dateCreated = new java.util.Date();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	@Override
	public String toString() {
		return "GeometricObject: color=" + color + ", filled=" + filled + ", dateCreated=" + dateCreated;
	}
}
