package exercise4;

import java.util.Iterator;
import java.util.Set;

public class Person {

	private Set<Course> courses;

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> arg) {
		courses = arg;
	}

	public void addCourses(Course course){
		courses.add(course);
	}

	public void removeCourse(Course  course){
		courses.remove(course);
	}

	public int coursesSize(){
		return courses.size();
	}

	public int countAdvancedCourses(){
		Iterator iter = courses.iterator();
		int count = 0;
		while (iter.hasNext()) {
			Course each = (Course) iter.next();
			if (each.isAdvanced()) {
				count++;
			}
		}
		return count;
	}
}
