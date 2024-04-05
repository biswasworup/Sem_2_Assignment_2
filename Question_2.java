class Complex{
	int real;
	int img;
	void setdata(int a,int b) {
		this.real=a;
		this.img=b;
	}
	void displydata() {
		System.out.println("Complex number is : "+this.real+"+"+this.img+"i");
	}
	Complex add(Complex a,Complex b) {
		Complex c=new Complex();
		c.real=a.real+b.real;
		c.img=a.img+b.img;
		return c;
	}
}
public class Question_2 {
	public static void main(String[]args) {
		Complex c1=new Complex();
		c1.setdata(14, 5);
		c1.displydata();
		Complex c2=new Complex();
		c2.setdata(11, 25);
		c2.displydata();
		System.out.println("After addition : ");
		Complex c3=c1.add(c2, c1);	
		c3.displydata();
	}
}
