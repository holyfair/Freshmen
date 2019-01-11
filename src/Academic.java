import java.util.ArrayList;
import java.util.Scanner;

public class Academic extends Person{
	
	public Academic() {
		super();
	}


	public Academic(int age, boolean sex, String firstName, String lastName) {
		super(age, sex, firstName, lastName);
	}

	

	@Override
	public int getAge() {
		return super.getAge();
	}


	@Override
	public void setAge(int age) {
		super.setAge(age);
	}


	@Override
	public boolean isSex() {
		return super.isSex();
	}


	@Override
	public void setSex(boolean sex) {
		super.setSex(sex);
	}


	@Override
	public String getFirstName() {
		return super.getFirstName();
	}


	@Override
	public void setFirstName(String firstName) {
		super.setFirstName(firstName);
	}


	@Override
	public String getLastName() {
		return super.getLastName();
	}


	@Override
	public void setLastName(String lastName) {
		super.setLastName(lastName);
	}


	void roll—all(Group group) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> here = new ArrayList<>();
		ArrayList<Student> left = new ArrayList<>();
		String answer;
		
		if(group.getList().isEmpty()) {
			System.out.println("Group is empty!");
		}
		System.out.println("Everybody are here?");
		for(Student student : group.getList()) {
			System.out.println(student.getLastName() + " " + student.getFirstName() + "?");
			for(;;) {
				answer = sc.next();
				if(answer.equals("here")) {
					here.add(student);
					break;
				} else if (answer.equals("left")) {
					left.add(student);
					break;
				} else {
					System.out.println("Incorrect asnwer! Try again.");
				}
			}
		}
		if(here.isEmpty()) {
			System.out.println("Class is empty...");
		} else {
			for(Student student : here) {
				System.out.println(student.getLastName() + " " + student.getFirstName() + " is here!");
			}
		}
		if(left.isEmpty()) {
			System.out.println("Everybody are here!");
		} else {
			for(Student student : left) {
				System.out.println(student.getLastName() + " " + student.getFirstName() + " is left!");
			}
		}
		
	}


	@Override
	public String toString() {
		return "Academic [" + super.toString();
	}
	
	
	
	
}
