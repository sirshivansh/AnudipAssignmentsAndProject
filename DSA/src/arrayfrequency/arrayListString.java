package arrayfrequency;

import java.util.ArrayList;
import java.util.Collections;

public class arrayListString extends Thread{
	public static void main(String[] args) {
		//m1();
		
		Student s1 = new Student(101, "Mahesh", 600000.50);
		Student s2 = new Student(102, "Sahil", 500000.50);
		Student s3 = new Student(103, "Rishabh", 600009.5);
		Student s4 = new Student(104, "Shivansh", 788888.7);
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		System.out.println(list);
		
		for(Student s : list) {
			System.out.println(s);
		}
		Collections.sort(list);
		
		for(Student s : list) {
			System.out.println(list);
		}
	}
	
	private static void m1() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Rajesh");
		list.add("Kamlesh");
		list.add("Nargish");
		list.add("Lajwaj");
		list.add("Gajodhar");
		System.out.println(list);
	}
}
class Student implements Comparable<Student>{
	private int rollNum;
	private String name;
	private double fees;
	
	public Student(int rollNum, String name, double fees) {
		super();
		this.rollNum = rollNum;
		this.name = name;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum +", name=" + name + ", fees=" + fees + "]";
	}
	
	@Override
	public int compareTo(Student obj) {
		return this.name.compareTo(obj.name);
	}
	
}