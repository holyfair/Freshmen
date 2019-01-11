import java.util.ArrayList;

public class Group {

	private Student headman;
	private ArrayList<Student> list = new ArrayList<>();
	
	
	boolean addStudent(Student student) throws DuplicationException{
		if(list.isEmpty()) {
			list.add(student);
			return true;
		}
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).equals(student)) {
				throw new DuplicationException();
			}
	       }
		list.add(student);
		
		return true;
	}
	
	boolean removeStudent(Student student){
		return list.remove(student);
	}
	
	
	void chooseHeadman() {
		for (Student student : list) {
			if(headman == null) {
				headman = student;
			}
			if(student.getAverageScore() > headman.getAverageScore()) {
				headman = student;
			}
			if(!headman.isScholarship() && student.isScholarship()) {
				headman = student;
			}
	       }
		System.out.println("Headman is: " + headman);
	}

	public Student getHeadman() {
		return headman;
	}

	public ArrayList<Student> getList() {
		return list;
	}
	
	
}
