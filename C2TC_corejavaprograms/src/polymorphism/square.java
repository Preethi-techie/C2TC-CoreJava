package polymorphism;

public class square extends Shape {
	public square(float area)
	{
		super.area=area;
	}
	@Override
	public void calarea() {
		System.out.println(super.area*area);
	}
	

}
