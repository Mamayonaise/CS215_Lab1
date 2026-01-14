package Lab1;

public class Cyclist implements IsMobile{
  
	@Override
	public double travelFlat(double distkm) {
		return distkm/15;
	}
	
	@Override
	public double travelElevated(double distkm, double angleDegrees) {
		double basetime = distkm/15;
		return basetime * (1 + Math.pow(angleDegrees, 1.4)/15);
	}
  
}
