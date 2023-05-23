 import java.util.*;
class stackimplementation{
	public static void main(String []args){
		Stack<Integer> s = new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(15);
		s.push(25);
		s.push(17);
		if(s.isEmpty()==false)
			System.out.println(s.pop());
		s.push(30);
		s.push(35);
		s.push(27);
		System.out.println(s.size());
		System.out.println(s.peek());
	}
}