package lab1;
import java.util.ArrayList;

public class Rectangle extends Polygon{
	public Rectangle(ArrayList<Double> sides) throws Exception
	{
		super(sides);
		if(sides.size()!=4) {
			throw new Exception("A rectangle requires exactly 4 sides.");
		}
	}

	double area;

	@Override
	public double computeArea() {
		area = sides.get(0) * sides.get(1);
		return area;
	}
	
}
