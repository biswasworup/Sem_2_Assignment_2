import java.util.*;
class Bank{
	String bankName;
	double depositAmount;
	static double totalAmount; 
	 void setBankName(String s) {
		this.bankName=s;
	}
	void setAmount(double b) {
		this.depositAmount=b;
	}
	void showData() {
		totalAmount+=depositAmount;
		System.out.println("Bank name : "+bankName+"\nDeposit Amount : "+depositAmount+"\nTotal amount is : "+totalAmount );
	}		
}
public class HA_3{
	public static void getlow(Bank[] b) {
		double low=b[0].depositAmount;
		String lows=b[0].bankName;
		for(Bank x:b) 
			if(x.depositAmount<low) {
				low=x.depositAmount;
				lows=x.bankName;			
		}
		System.out.println("Bank with lowest deposit is : "+lows+" with deposit amount : "+low);
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		Scanner bc=new Scanner(System.in);
		System.out.println("Enter no. of Banks you want to deposit : ");
		int n=bc.nextInt();
		Bank[] b=new Bank[n];
		for(int i=0;i<n;i++)  {
			System.out.println("Enter Bank name : \nDeposit Amount : ");
			b[i]=new Bank();
			String bankName=sc.next();
			double dm=bc.nextDouble();
			b[i].setBankName(bankName);
			b[i].setAmount(dm);
		}
		for(Bank x:b)x.showData();	
		getlow(b);
	}

}