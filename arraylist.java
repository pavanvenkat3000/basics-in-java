/*import java.util.ArrayList;
class arraylist{
	public static void main(String []args){
		ArrayList <Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(4);
		a.add(6);
		a.add(5);
		a.add(8);
		a.add(7);
		a.add(4);
		a.remove(1);
		a.remove(new Integer(5));
		System.out.print(a.get(0)+" ");// to access an item;
		a.set(0,9);
		System.out.print(a.get(0));
		System.out.print(a.get(2)+" ");
		a.remove(2);
		System.out.print(a.get(2));
		System.out.print(a.size());
	}
}*/

import java.util.*;
class arraylist{
	public static void main(String []args){
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(3);
		al.add(23);
		al.add(34);
		al.add(10);
		al.add(4);
		al.add(6);
		al.add(5);
		al.add(8);
		al.add(7);
		al.add(4);
		al.set(0,10);
		System.out.println(al.remove(new Integer(3)));
		System.out.println(al);
	}
}