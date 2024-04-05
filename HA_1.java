import java.util.*;
class Comission{
	double sales;
	Comission(double sales){
		this.sales=sales;		
	}
	double getComission() {
		double comission;		
		if (sales<=100)comission=0.02*sales;
		else if (sales>=500 && sales <=5000)comission=0.05*sales;
		else comission=0.08*sales;
		return comission;
	}
}
public class HA_1{
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter sales to get comission : ");
		double sales=sc.nextDouble();
		if (sales<0) {
			System.out.println("Invalid input");
			return;
		}
		Comission c=new Comission(sales);		
		System.out.println("Your comission is : "+c.getComission());
	}
}