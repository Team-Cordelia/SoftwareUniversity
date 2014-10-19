package Geometry.Vertices;

public class Vertex3D extends Vertex {
	private double z;

	public Vertex3D(double x, double y, double z) {
		super(x, y);
		this.setZ(z);
	}

	public double getZ() {
		return z;
	}

	private void setZ(double z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "[x=" + this.x + ", y=" + this.y + " z=" + z + "] "; 
	}
}
