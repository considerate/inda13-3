import java.util.TreeSet;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Before;
import org.junit.After;

import org.junit.rules.ExpectedException;

@RunWith(JUnit4.class)
public class TestSortPerson {
	private TreeSet<Person> set;

	@Before
	public void setUp() {
		set = new TreeSet<Person>();
	}
	@After
	public void tearDown() {
		set = null;
	}

	@Test
	public void testSortPersons() {
		set.add(new Person("Viktor",21));
		set.add(new Person("David",30));
		set.add(new Person("Joel",34));
		set.add(new Person("Christopher",22));
		assertEquals("[Viktor: 21, Christopher: 22, David: 30, Joel: 34]", set.toString());
	}
}