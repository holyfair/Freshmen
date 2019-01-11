
public class Student extends Person{

	private int yearOfStudy;
	private double averageScore;
	private boolean scholarship;
	
	public Student() {
		super();
	}

	public Student(int age, boolean sex, String firstName, String lastName, int yearOfStudy, double averageScore, boolean scholarship) {
		super(age, sex, firstName, lastName);
		this.yearOfStudy = yearOfStudy;
		this.averageScore = averageScore;
		this.scholarship = scholarship;
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

	public int getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(int yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}

	public double getAverageScore() {
		return averageScore;
	}

	public void setAverageScore(double averageScore) {
		this.averageScore = averageScore;
	}

	public boolean isScholarship() {
		return scholarship;
	}

	public void setScholarship(boolean scholarship) {
		this.scholarship = scholarship;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Double.doubleToLongBits(averageScore) != Double.doubleToLongBits(other.averageScore))
			return false;
		if (scholarship != other.scholarship)
			return false;
		if (yearOfStudy != other.yearOfStudy)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [yearOfStudy=" + yearOfStudy + ", averageScore=" + averageScore + ", scholarship=" + scholarship
				+ " " + super.toString();
	}

}
