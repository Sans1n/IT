
public class Triangle {

	public double a, b, c;

	public static Triangle factory(double a, double b, double c) throws ExceptionTria {

		if (a == b && a == c && b == c) {
			return new Triangle(a, b, c);
		}
		if (a == b || a == c || b == c) {
			return new Triangle(a, b, c);
		} else {
			throw new ExceptionTria("nelze sestrojit trojuhelnik jiny nez pravouhly nebo rovnorameny");
		}
	}

	public double getObsah() {
		if(a == b) {
			return (c/4*(Math.sqrt(4*Math.pow(a, 2) - Math.pow(c, 2))));
		}
		
		if(a == c) {
			return (b/4*(Math.sqrt(4*Math.pow(a, 2) - Math.pow(b, 2))));
		}
		
		if(b == c) {
			return (a/4*(Math.sqrt(4*Math.pow(b, 2) - Math.pow(a, 2))));
		}
		return (Double) null;
		
	}
	
	public double getObvod() {
		
		return a+b+c;
	}
	public Triangle() {
		super();
	}

	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public String toString() {
		return "Triangle [" + a + " "+ b +" "+ c + "]";
	}

}
