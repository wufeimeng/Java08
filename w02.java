class cbbb{
	double a;
	double b;
}
public class class01 {
	public static void main(String[] args) {
		cbbb obj1=new cbbb();
		cbbb obj2=new cbbb();
		cbbb agv=new cbbb();
		obj1.a=5.2;
		obj1.b=3.9;
		obj2.a=6.5;
		obj2.b=4.6;
		agv.a=(obj1.a+obj2.a)/2;
		agv.b=(obj1.b+obj2.b)/2;
		
		System.out.println("obj1.x="+obj1.a+"obj1.y="+obj1.b);
		System.out.println("obj2.x="+obj2.a+"obj2.y="+obj2.b);
		System.out.println("agv.x="+agv.a);
		System.out.println("agv.y="+agv.b);
	

	}
	
}
