package in.ineuron.cal;

public class AreaAndPerimenteCalculatorOfShapesImpl implements IAreaAndPerimenteCalculatorOfShapes {

	private final float pi = 3.14f; 
	
	@Override
	public float calculateAreaOfCircle(float radius) {
		return pi*radius*radius;
	}

	@Override
	public float calculatePerimeterOfCircle(float radius) {
		return 2*pi*radius*radius;
	}

	@Override
	public float calculatePerimeterOfTriangle(float s1, float s2, float s3) {
		return (s1+s2+s3);
	}

	@Override
	public float calculateAreaOfTriangle(float base, float height) {
		
		return (base*height)/2;
	}

}
