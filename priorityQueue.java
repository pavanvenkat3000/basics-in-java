import java.util.*;
class priorityQueue{
	public static void main(String []args){
		/*PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		PriorityQueue<Integer> pqu = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		pq.add(10);
		pq.add(5);
		pq.add(20);
		pq.add(2);
		pq.add(4);
		pq.add(8);
		
		pqu.add(10);
		pqu.add(5);
		pqu.add(20);
		pqu.add(2);
		pqu.add(4);
		pqu.add(8);
		
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println();
		System.out.println(pqu.poll());
		System.out.println(pqu.poll());
		System.out.println(pqu.poll());
		System.out.println(pqu.poll());
		*/
		PriorityQueue<Node> pq = new PriorityQueue<Node>();
		Node arr[] = new Node[10];
		for(int i=0;i<10;i++){
			arr[i] = new Node(i+1,10-i);
			pq.add(arr[i]);
		}
		
		/*for(int i=0;i<10;i++){
			Node nd= pq.poll();
			System.out.println(nd.val+" "+nd.key);
		}*/
		arr[5].key=11;
		pq.remove(3);
		for(int i=0;i<10;i++){
			Node nd= pq.poll();
			System.out.println(nd.val+" "+nd.key);
		}
	}
}
class Node implements Comparable<Node>{
	int val;
	int key;
	Node(int val,int key){
		this.val = val;
		this.key = key;
	}
	public int compareTo(Node N){
		return this.key-N.key;
	}
}