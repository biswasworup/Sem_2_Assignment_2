class Deposit{
	long Principal;
	int time;
	double rate;
	double totalamt;
	Deposit (){		
	}
	Deposit (long p,int t,double r){
		this.Principal=p;
		this.time=t;
		this.rate=r;
	}
	Deposit (long p,int t){
		this.Principal=p;
		this.time=t;
	}
	Deposit (long p,double r){
		this.Principal=p;
		this.rate=r;
	}
	void dispAmt() {
		System.out.println("Principal amount : "+Principal+"\ntime : "+time+" rate : "+rate+"\nTotal Amount : "+totalamt);
	}
	double totalAmt() {
		totalamt= Principal + (Principal*rate*time)/100;
		return totalamt;
	}
}
public class Question_4 {
	public static void main(String[]args) {
		Deposit d1=new Deposit();
		d1.totalAmt();
		d1.dispAmt();
		Deposit d2=new Deposit(108089,20,2.5);
		d2.totalAmt();
		d2.dispAmt();
		Deposit d3=new Deposit(9796,30);
		d3.totalAmt();
		d3.dispAmt();
		Deposit d4=new Deposit(8757647,0.05);
		d4.totalAmt();
		d4.dispAmt();
	}
}
