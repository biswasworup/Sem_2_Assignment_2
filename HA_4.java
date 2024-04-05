
class Distance{
	int meter;
	double centimeter;
	Distance(){		
	}
	Distance(int d,double c){
		this.meter=d;
		this.centimeter=c;
	}
	void disply() {
		System.out.println("Distance is : "+meter+" meters and "+centimeter+" centimeters.");
	}
	void sum(Distance a, Distance b) {
		Distance c=new Distance();
		c.meter=a.meter+b.meter;
		c.centimeter=a.centimeter+b.centimeter;
		c.disply();
	}
}
public class HA_4{
	public static void main(String[]args) {		
		Distance d1=new Distance(199,90);
		d1.disply();
		Distance d2=new Distance(90,199);
		d2.disply();
		System.out.println("After addition of two distances");
		Distance d3=new Distance();
		d3.sum(d1, d2);	
	}
}