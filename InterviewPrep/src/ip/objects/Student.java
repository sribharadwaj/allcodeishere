package ip.objects;

public class Student implements Comparable<Student>{
	public String name;
	public int id;
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		return this.id-o.id;
	}
	
	
	
}
