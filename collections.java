import java.util.*;
// class collections{
// 	public static void main(String []args){
// 		ArrayList<Integer> a = new ArrayList<Integer>();
// 		a.add(8);
// 		a.add(2);
// 		a.add(1);
// 		a.add(5);
// 		a.add(9);
// 		Collections.sort(a);
// 		System.out.println(a);
// 		Collections.sort(a,Collections.reverseOrder());
// 		System.out.println(a);
// 	}
// }

class collections{
	public static void main(String []args){
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(-1);
		al.add(34);
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
	}
}