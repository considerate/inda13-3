import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Before;
import org.junit.After;

import org.junit.rules.ExpectedException;
import java.util.EmptyStackException;

@RunWith(JUnit4.class)
public class TestLinkedStack {
	private LinkedStack<String> stack;

	@Rule 
	public ExpectedException expectedException = ExpectedException.none();

	@Before
	public void setUp() {
		stack = new LinkedStack<String>();
	}
	@After
	public void tearDown() {
		stack = null;
		expectedException = ExpectedException.none();
	}

	@Test
	public void testPush() {
		assertEquals(true, stack.isEmpty());
		stack.push("Hej");
		assertEquals(false, stack.isEmpty());
	}

	@Test
	public void testPop() {
		stack.push("Hej");
		String a = stack.pop();
		assertEquals("Hej", a);
		expectedException.expect(EmptyStackException.class);
		stack.pop();

	}

	@Test
	public void testPeek() {
		stack.push("Hej");
		String a = stack.peek();
		assertEquals("Hej", a);
		stack.pop();
		expectedException.expect(EmptyStackException.class);
		stack.top();
		stack.peek();
	}


	@Test
	public void testSize() {
		stack.push("Hej");
		stack.push("Hallå");
		assertEquals(2, stack.size());
	}

}