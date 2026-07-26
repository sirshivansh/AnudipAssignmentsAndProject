package InterviewPreparation;

public class StaticBlock {

	public StaticBlock() {
		System.out.println("Default constructor called.....");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello");
		new StaticBlock();

	}
	
	//static block
	static {
		System.out.println("Word");
	}
	
	//instance block
	{
		System.out.println("Instance block called before object initialization");
	}
}
