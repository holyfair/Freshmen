
public class Main {

	public static void main(String[] args) {
		
		Student vlad = new Student(19, true, "Vlad", "Blahov", 2, 71, false);
		Student masha = new Student(18, false, "Masha", "Ilchuk", 2, 91, true);
		Student danil = new Student(18, true, "Danil", "Efimov", 2, 65, false);
		Student dima = new Student(18, true, "Dima", "Khomenko", 2, 69, false);
		
		Group squad = new Group();
		
		try {
			squad.addStudent(vlad);
			squad.addStudent(masha);
			squad.addStudent(danil);
			squad.addStudent(dima);
			squad.addStudent(vlad);
		} catch (DuplicationException e) {
			System.out.println(e.getMessage());
		}
		squad.removeStudent(danil);
		System.out.println(squad.getList());
		squad.chooseHeadman();
		
		Academic glybovets = new Academic(64, true, "Kolya", "Glybovets");
		glybovets.roll—all(squad);

	}

}
