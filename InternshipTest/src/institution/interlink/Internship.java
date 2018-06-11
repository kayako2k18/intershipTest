package institution.interlink;
import java.util.ArrayList;
import person.Student;

public class Internship {
	public String name;
	ArrayList<Student> people = new ArrayList<Student>();
    public Internship(String name) {
    	this.name=name;
        //TODO: Implementation is needed
    }

    public void setStudent(Student student) {
    	people.add(student);
        //TODO: Implementation is needed
    }

    public String getStudents() {
    	String names="";
    	for(Student person:people)
    	{
    		names=names+person.name+"\n";
    	};
    	return names;
        //TODO: Implementation is needed
    }
}
