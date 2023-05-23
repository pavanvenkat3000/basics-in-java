// Java program to demonstrate working of Comparator interface and Collections.sort() to sort according
 //to user defined criteria.
/*import java.util.*;
import java.lang.*;
import java.io.*;

// A class to represent a student.
class Student
{
	int rollno;
	String name, address;

	public Student(int rollno, String name, String address)
	{
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	// Used to print student details in main()
	public String toString()
	{
		return this.rollno + " " + this.name +" " + this.address;
	}
}

class Sortbyroll implements Comparator<Student>
{
	// Used for sorting in ascending order of roll number
	public int compare(Student a, Student b)
	{
		return a.rollno - b.rollno;
	}
}

class Main
{
	public static void main (String[] args)
	{
		ArrayList<Student> ar = new ArrayList<Student>();
		ar.add(new Student(111, "bbbb", "london"));
		ar.add(new Student(131, "aaaa", "nyc"));
		ar.add(new Student(121, "cccc", "jaipur"));

		System.out.println("Unsorted");
		for (int i=0; i<ar.size(); i++)
			System.out.println(ar.get(i));

		Collections.sort(ar, new Sortbyroll());

		System.out.println("\nSorted by rollno");
		for (int i=0; i<ar.size(); i++)
			System.out.println(ar.get(i));
	}
}

// comparator for priorityqueue
// Java code to illustrate the use of comparator()
import java.util.Comparator;
import java.util.PriorityQueue;

class The_Comparator implements Comparator<String> {
	public int compare(String str1, String str2)
	{
		String first_Str;
		String second_Str;
		first_Str = str1;
		second_Str = str2;
		return second_Str.compareTo(first_Str);
	}
}

public class Priority_Queue_Demo {
	public static void main(String[] args)
	{
		PriorityQueue<String> queue = new
		PriorityQueue<String>(new The_Comparator());

		queue.add("G");
		queue.add("E");
		queue.add("E");
		queue.add("K");
		queue.add("S");
		queue.add("4");

		System.out.println("The elements with the highest priority element at front of queue"
						+ "order:");
		while(!queue.isEmpty()){
		System.out.print(" "+queue.poll());
		}
	}
}

*/
import java.util.*;

class pair {
	int a;
	int b;
	pair(int a, int b){
		this.a =a;
		this.b =b;
	}
}

class myCompare implements Comparator<pair>{
	public int compare(pair p1, pair p2){
		return p1.b-p2.b;
	}
}

class comparatorinterface{
	public static void main(String []args){
		pair arr[] = new pair[4];
		arr[0]=new pair(1,2);
		arr[1]=new pair(3,5);
		arr[2]=new pair(-1,3);
		arr[3]=new pair(0,4);
		Arrays.sort(arr, new myCompare());
		
		for(int i=0;i<4;i++){
			System.out.println(arr[i].a +" "+arr[i].b);
		}
	}
}
