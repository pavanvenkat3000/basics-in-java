import java.util.*;
class treeset{
	public static void main(String []args){
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(5);
		ts.add(15);
		ts.add(20);
		ts.add(1);
		ts.add(12);
		ts.add(25);
		ts.add(26);
		ts.add(30);
		ts.remove(12);
		System.out.println(ts.lower(10));
		System.out.println(ts.higher(10));
		System.out.println(ts.floor(15));
		System.out.println(ts.ceiling(15));
		System.out.println(ts.contains(25));
		
		for(int i: ts){
			System.out.print(i+" ");
		}
	}
}