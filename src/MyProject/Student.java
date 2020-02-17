package MyProject;

public class Student {
	private int id;
	private String name;
	private int classno;
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getClassno() {
		return classno;
	}



	public void setClassno(int classno) {
		this.classno = classno;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", classno=" + classno + "]";
	}
	
	}
	
	


