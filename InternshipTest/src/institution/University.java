package institution;
import java.util.ArrayList;
import person.Student;

public class University {
	public String name;
	public int level=3;
	public ArrayList<Student> people = new ArrayList<Student>();
    public University(String name) {
    	this.name=name;
        //TODO: Implementation is needed
    }

    public void setStudent() {
    	for(int i=0;i<people.size();i++)
    	{
    		if(people.get(i).level<this.level)
    		{
    			people.remove(i);
    		}
    	}
        //TODO: Implementation is needed
    }

    public void addStudent(Student student) {
    	people.add(student);
        //TODO: Implementation is needed
    }
}
