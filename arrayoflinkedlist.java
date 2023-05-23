
/*import java.util.*;
class arrayoflinkedlist{
	static LinkedList<Integer> [] table;
	public static void main(String []args){
		table = new LinkedList[5];
		for(int i=0;i<5;i++){
			table[i]= new LinkedList<Integer>();
		}
		table[1].add(2);
		table[2].add(3);
		System.out.println(table[1].get(0));
	}
}*/

import java.util.*;
class arrayoflinkedlist{
	static LinkedList<Integer> [] table;
	public static void main(String []args){
		table = new LinkedList[5];
		for(int i=0;i<5;i++){
			table[i] = new LinkedList<Integer>();
		}
		table[4].add(3);
		table[4].add(0);
		table[1].add(3);
		table[2].add(2);
		table[1].add(4);
		
		for(int i=0;i<table.length;i++){
			for(int j=0;j<table[i].size();j++){
				System.out.print(table[i].get(j)+" ");
			}
			System.out.println();
		}
	}
}
