package exercise4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;


public class App {

	public static void main(String[] args) {
		// Client code
		Person kent = new Person();
		Set s = new HashSet();
		s.add(new Course("MC426", false));
		s.add(new Course("MC646", true));
		kent.setCourses(s);
		Assert.assertEquals(2, kent.coursesSize());
		Course machinelearning = new Course("MC886", true);
		kent.addCourses(machinelearning);
		kent.addCourses(new Course("MC536", false));
		Assert.assertEquals(4, kent.coursesSize());
		kent.removeCourse(machinelearning);
		Assert.assertEquals(3, kent.coursesSize());

		System.out.print("Advanced courses: " + kent.countAdvancedCourses());
	}

}