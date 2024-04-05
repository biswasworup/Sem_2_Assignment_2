class Product{
	String prodId;
	double price;
	double quantity;
	static double totalprice;
	Product(String a,double b,double c){
		this.prodId=a;
		this.price=b;
		this.quantity=c;
	}
	void disply() {
		totalprice+=price*quantity;
		System.out.println("ProductID : "+prodId+" Price : "+price+" Quantity : "+quantity+"kg\nTotal amount purchased : "+totalprice);
	}
	
}
public class Question_3 {
	public static void main(String[]args) {
		Product p1=new Product("1234@abc",199,10);
		p1.disply();
		Product p2=new Product("1234@def",299,8);
		p2.disply();
		Product p3=new Product("1234@ghi",399,6);
		p3.disply();
		Product p4=new Product("1234@jkl",499,4);
		p4.disply();
		Product p5=new Product("1234@mno",599,2);
		p5.disply();
	}
}
