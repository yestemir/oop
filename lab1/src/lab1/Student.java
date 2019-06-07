package lab1;

public class Student {
	public String name;
	public String id;
	public int year = 1;
	
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void year_of_study() {
		year++;
	}
	
	
	
	
}
