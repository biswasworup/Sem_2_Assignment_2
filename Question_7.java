interface DetailInfo{
	void disply();
	void count();
}
class Person implements DetailInfo{
	String Name;
	static int maxcount;
	Person(String s){
		this.Name=s;
	}
	public void disply(){
		System.out.println("Name of the person : "+Name);
	}
	public void count() {
		String temp=Name.replace(" ","");
		System.out.println("no. of characters in the name : "+temp.length());
	}
}
public class Question_7 {
	public static void main(String[]args) {
		Person p1=new Person("Rohit Ranjan Randey");
		p1.disply();
		p1.count();
	}
}
