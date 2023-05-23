import java.util.*;
class hashmap{
	public static void main(String []args){
		//key(index), value pair;
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(2,"pavan");
		hm.put(4,"varun");
		hm.put(6,"katiram");
		hm.put(3,"ramesh");
		hm.put(9,"rakesh");
		hm.put(9,"ravi");
		System.out.println(hm.containsKey(6));
		System.out.println(hm.get(3));
		System.out.println(hm.get(4));
		System.out.println(hm.size());
		hm.remove(4);
		System.out.println(hm.size());
		for(int i : hm.keySet()){
			System.out.print(i+" ");
		}
		System.out.println();
		for(String i : hm.values()){
			System.out.print(i+" ");
		}
		System.out.println();
	}
}

/*HashMap<Integer,String> hm = new HashMap<Integer,String>();
hm.put(0,"pavan");
hm.get(3);
hm.containsKey();
hm.size();
hm.remove(3);
for(int i : hm.keySet())
for(int i : hm.values())*/