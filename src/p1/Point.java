package p1;

public class Point {

	int x = 5;
	int y = 5;

	public static void main(String[] args) {
		{
			System.out.println("I am executed in instance block 2");
		}
		
		Point v1 = new Point();
		Point v2 = new Point();

		v1.print();
		v2.print();
		
		{
			System.out.println("I am executed in instance block3");
		}
	}

	static
	{
		System.out.println("I am executed in static block");
	}
	
	{
		System.out.println("I am executed in instance block");
	}
	
	void move(int v1, int v2) {
		x = v1;
		y = v2;
	}

	void print() {
		System.out.println(x);
		System.out.println(y);
	}

	Point(int v1, int v2) {
		x = v1;
		y = v2;
	}
	
	static
	{
		System.out.println("I am executed in static block 2");
	}
	
	{
		System.out.println("I am executed in instance block again");
	}

	Point() {
		print();
		x = 3;
		y = 7;
	}
}
