package contentjava;

public class Student {
	String email;
	String name;
	public Student(String name2, String email) {
		this.name=name;
		this.email=email;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
