import java.util.*;
class Book{
	String BName;
	int BEdition;
	double Bprice;
	Book(String s, int a, double b){
		this.BName=s;
		this.BEdition=a;
		this.Bprice=b;
	}
		void disply() {
			System.out.println("Book name : "+BName+"\nBook Edition : "+BEdition+(BEdition==1?"st":BEdition==2?"nd":BEdition==3?"rd":"th")+"\nBook price : "+Bprice);			
	}
}
public class HA_2{
	public static void main(String[]args) {
		Scanner sc1= new Scanner(System.in);
		Scanner sc2= new Scanner(System.in);
		System.out.println("Enter no. of books purchased : ");
		int n=sc2.nextInt();
		Book[] b=new Book[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter name : "+"\nEdition : \nPrice");
			String BName1=sc1.nextLine();
			int BEdition1=sc2.nextInt();
			double Bprice1=sc2.nextDouble();
			b[i]=new Book(BName1,BEdition1,Bprice1);			
       }
		for(Book x:b)
			x.disply();
		double max=b[0].Bprice;
		String maxs=b[0].BName;
		for(Book x:b) 
			if(x.Bprice>max) {
				max=x.Bprice;
				maxs=x.BName;
			}
		System.out.println("Maximum price book is : "+maxs+" with price : "+max);
	}	
}