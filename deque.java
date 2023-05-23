import java.util.*;
class deque{
	public static void main(String []args){
		Deque<Integer> d = new LinkedList<Integer>();
		d.offerFirst(3);
		d.offerFirst(4);
		d.offerFirst(7);
		d.offerLast(9);
		d.offerLast(8);
		d.offerLast(6);
		System.out.println(d.peekFirst());
		System.out.println(d.pollFirst());
		System.out.println(d.peekFirst());
		System.out.println(d.size());
		System.out.println(d.peekLast());
		System.out.println(d.pollLast());
		System.out.println(d.peekLast());
		System.out.println();
		for(int i : d)
			System.out.print(i+" ");
	}
}