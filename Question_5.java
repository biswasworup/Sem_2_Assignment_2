class PersonQ5{
	String Name;
	int age;
	PersonQ5(String s,int n){
		this.Name=s;
		this.age=n;
	}
}
class Employee extends PersonQ5{
	double Eid;
	double salary;
	Employee(String s,int n,double a,double b){
		super(s,n);
		this.Eid=a;
		this.salary=b;
	}
	void dispemp() {
		System.out.println("Name of the employee : "+Name+"\nAge : "+age+"\nEid : "+Eid+"\nSalary : "+salary);
	}
}
public class Question_5 {
	public static void main(String[]args) {
		Employee p1=new Employee("Rohit",20,180000,986877464);
		p1.dispemp();
		Employee p2=new Employee("Mohit",20,10000,9867464);
		p2.dispemp();
	}
}
