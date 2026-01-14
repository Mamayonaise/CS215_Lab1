package lab1;
import java.util.ArrayList;

public class RightTriangle extends Polygon{
	public RightTriangle(ArrayList<Double> sides) throws Exception 
	{
		super(sides);
		if (sides.size()!=3) {
			throw new Exception("A right triangle requires exactly 3 sides");
		}
	}
	
	double area;
	
	@Override
	public double computeArea() {
		area = sides.get(0) * sides.get(1) / 2;
		return area;
	}
}
