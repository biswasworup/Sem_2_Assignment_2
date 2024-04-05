abstract class Marks{
	double markICP;
	double markDSA;
	double percentage;
	abstract double getPercentage();
}
class CSE extends Marks{
	double algodesign;
	CSE(double a,double b,double c){
		this.markICP=a;
		this.markDSA=b;
		this.algodesign=c;
	}
	double getPercentage() {
		return (markICP+markDSA+algodesign)/3;
	}
}
class nonCSE extends Marks{
	double engMechanics;
	nonCSE(double a,double b,double c){
		this.markICP=a;
		this.markDSA=b;
		this.engMechanics=c;
	}
	double getPercentage() {
		return (markICP+markDSA+engMechanics)/3;
	}
}
public class Question_6 {
	public static void main(String[]args) {
		CSE s1=new CSE(99,99,99);
		nonCSE s2=new nonCSE(98,98,98);
		System.out.println("Percentage of CSE student is : "+s1.getPercentage()+"%");
		System.out.println("Percentage of NonCSE student is : "+s2.getPercentage()+"%");
	}
}
