import java.util.*;
class treemap{
	public static void main(String []args){
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		tm.put(1,"pavan");
		tm.put(2,"venkat");
		tm.put(-1,"vakkalagadda");
		tm.put(3,"sai");
		tm.put(5,"boy");
		tm.put(4,"good");
		System.out.println(tm);
		System.out.println(tm.containsKey(5));
		for(int i : tm.keySet()){
			System.out.print(" "+tm.get(i));
		}
		
		System.out.println(tm.get(tm.lowerKey(2)));
		System.out.println(tm.get(tm.higherKey(2)));
		System.out.println(tm.get(tm.floorKey(6)));
		System.out.println(tm.get(tm.ceilingKey(-2)));
		
	}
}