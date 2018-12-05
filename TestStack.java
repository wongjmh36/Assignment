
import java.util.Stack;

public class TestStack {

    public static void main(String args[]) {
        Stack s = new Stack();

        System.out.println(s);

        s.push(new Character('A'));
        //System.out.println("Pop the letter 'A' :");
        //s.pop();
        System.out.println(s);
        s.push(new Integer(123));
        System.out.println(s);
        s.push("Jason");
        System.out.println(s);
        s.push(new Character('Y'));
        System.out.println(s);
        s.push(new Integer(456));
        System.out.println(s);

        System.out.println("peek() returns: " + s.peek());        
        System.out.println("Jason is at " + s.search("Jason"));        
        
        System.out.println();
    }

}
