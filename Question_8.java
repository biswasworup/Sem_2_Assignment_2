import Question_8.Sports;

class Student{
	String Name;
	int roll;
	void inputDetails(String s,int a) {
		this.Name=s;
		this.roll=a;
	}
	void showDetails() {
		System.out.println("Name of the student : "+Name+"\nRoll number : "+roll);
	}
}
class Test extends Student{
	double mark1;
	double mark2;
	void inputDetails(double a,double b) {
		this.mark1=a;
		this.mark2=b;
	}
	void showDetails() {
		System.out.println("marks are : "+mark1+" and "+mark2);
	}
}
public class Question_8{
	public static void main(String[]args) {
		Student j3=new Student();
		j3.inputDetails("Rohit",48);
		j3.showDetails();
		Test midsem=new Test();
		System.out.print("In studies ");
		midsem.inputDetails(14,15);
		midsem.showDetails();
		Test sports=new Test();
		sports.inputDetails(Sports.score1, Sports.score2);
		System.out.print("In sports ");
		sports.showDetails();
		double total=midsem.mark1+midsem.mark2+Sports.score1+Sports.score2;
		System.out.println("Grand total is : "+total);
	}
}