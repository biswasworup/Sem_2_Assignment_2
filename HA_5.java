
class PointType{
	double x;
	double y;
	PointType(){
		this.x=0;
		this.y=0;
	}
	PointType(double a,double b) {
		this.x=a;
		this.y=b;
	}
	void setPoint(double a,double b) {
		this.x=a;
		this.y=b;
	}
	void showPoint() {
		System.out.println("the point is ("+x+","+y+")");
	}
	void printcoordinates() {
		System.out.println("X-coordinate is : "+x+"\nY-coordinate is : "+y);
	}
	double x(){
		return x;
	}
	double y(){
		return y;
	}
}
class Circle extends PointType{
	double radius;
	PointType centre;
	Circle (){
	//	super();
		this.radius =0;
		this.centre=new PointType();
	}
	Circle(PointType p,double r){
	//	super(p.x,p.y);
		this.radius=r;
		this.centre=new PointType(p.x,p.y);
	}	
	void setRadius(double r) {
		this.radius=r;
	}
	void printRadius() {
		System.out.println("Radius of the circle is : "+radius);
	}
	void setCircle(PointType p) {
		this.centre=new PointType(p.x,p.y);
	}
	void areaOfCircle() {
		System.out.println("Area of circle is : "+(radius*Math.PI*radius)+" sq. units.");
	}
	void circumference() {
		System.out.println("Circumference of circle is : "+(2*Math.PI*radius)+" units.");
	}
	void displyCircle() {
		if (centre.x==0 && centre.y==0)System.out.println("Circle is centred at origin with radius "+radius);	
		else System.out.println("The circle is centered at("+centre.x+","+centre.y+") with radius "+radius);
	}	
}
public class HA_5{
	public static void main(String[]args) {
		PointType p1=new PointType(0,0);
		p1.showPoint();		
		p1.printcoordinates();
		Circle c2=new Circle(p1,4);
		c2.displyCircle();
		c2.areaOfCircle();
		c2.circumference();
		System.out.println("Updated : ");
		c2.setRadius(5);
		c2.printRadius();
		p1.setPoint(-2.9, 3.1);
		p1.showPoint();		
		p1.printcoordinates();
		c2.setCircle(p1);
		c2.displyCircle();
		c2.areaOfCircle();
		c2.circumference();		
	}
}
