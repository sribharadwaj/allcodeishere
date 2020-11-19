package ip.collections;

import java.util.TreeSet;

import ip.objects.Student;

public class CollectionQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		treeSetQuestions();
	}

	public static void treeSetQuestions() {
		TreeSet<Student> ts = new TreeSet<Student>();
		
		Student s1 = new Student("RSB",1);
		Student s2 = new Student("GLT",2);
		
		ts.add(s1);
		if(s1.equals(s2)) ts.add(s2);
		
		ts.forEach(s ->System.out.println(s.name));
	}
}
