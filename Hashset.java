import java.util.*;
class Hashset{
	public static void main(String []args){
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(4);
		hs.add(6);
		hs.add(3);
		hs.add(7);
		hs.add(9);
		System.out.println(hs.add(2));
		System.out.println(hs.contains(6));
		hs.remove(3);
		System.out.println(hs.size());
		for(int i : hs){
			System.out.println(i);
		}
		hs.clear();
	}
}