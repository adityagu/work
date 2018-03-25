package cybage;

public class StaticClass {

	private static int x;
	private static int y;

	public StaticClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static int getX(){
		return x;
	}

	public static int getY(){
		return y;
	}
	public static void main(String[] args) {
		StaticClass.x=23;
		StaticClass.y=21;
		
		System.out.println("value of x  " + StaticClass.x );
		System.out.println("value of y  " + + StaticClass.y);
	}
}
