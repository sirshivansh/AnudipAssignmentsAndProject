package InterviewPreparation;


public class Test {
	public static void main(String[] args) {
		Student s1 = new Student(101, "Keshav");
		Student s2 = new Student(102, "Neeraj");
		Student s3 = new Student(102, "Neha");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}

class Student {
	private int rollNum;
	private String name;
	private static String collegeName = "Saraswati College of Engineering";
	
	public Student(int rollNum, String name) {
		super();
		this.rollNum = rollNum;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student[rollNum=" + rollNum + ", name=" + name + ","
				+ " collegeName=" + collegeName + "]";
	}
	
}
