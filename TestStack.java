
import java.util.Stack;

public class TestStack {
	public static void main (String args[]) {
		Stack s = new Stack();				
	

		System.out.println(s);

		//System.out.println("Jason is at " + s.search("Patrick"));

		s.push(new Character('C'));
		System.out.println(s);
		s.push(new Character('D'));
		System.out.println(s);
		s.push("Jason");
		System.out.println(s);
		s.push("Peter");
		System.out.println(s);
		s.push(new Integer(123));
		System.out.println(s);
		s.push("Alice");
		System.out.println(s);
		s.push(new Character('Y'));
		System.out.println(s);
		s.push(new Double(700));
		System.out.println(s);

		System.out.println("peek() returns: " + s.peek());

		//System.out.println("Patrick is at " + s.search("Patrick"));
		//System.out.println("A is at " + s.search(new Character('A')));
		//System.out.println("789.123 is at " + s.search(new Double(789.123)));
		//System.out.println("Peter is at " + s.search("Peter"));

		
		System.out.println();
	}

} 