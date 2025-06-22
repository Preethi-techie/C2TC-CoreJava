package Day8Abstraction;

public class Square {
	private float side;
	public Square()
	{
		side=2.0f;
	}
	public Square(float side)
	{
		this.side=side;
	}
	
	void calArea() {
	    float area = side*side;		
	}
}
