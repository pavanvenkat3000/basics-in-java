import java.util.LinkedList;
import java.util.Queue;
class queueinterface{
	public static void main(String []args){
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(5);
		q.add(3);
		q.add(6);
		q.add(7);
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.peek());
	}
}