import java.util.*;
class PersonQ1{
	String Name;
	int age;
	void setData(String s,int n) {
		this.Name=s;
		this.age=n;
	}
	void dispData() {
		System.out.println("Name of the person is : "+Name+" age : "+age);
	}
}
public class Question_1 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		PersonQ1 p1=new PersonQ1();
		PersonQ1 p2=new PersonQ1();
		p1.setData("Rohit", 20);
		p1.dispData();
		System.out.println("Enter another person name and age : ");
		String s=sc.next();
		int n=sc.nextInt();
		p2.setData(s, n);
		p2.dispData();
		if(p2.age>p1.age)System.out.println(p2.Name+" is older than "+p1.Name);
		else if(p1.age==p2.age)System.out.println(p2.Name+" is same age as "+p1.Name);
		else System.out.println(p2.Name+" is younger than "+p1.Name);
	}
}
