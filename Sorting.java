import java.util.Arrays;
import java.util.Collections;
class Sorting{
	public static void main(String []args){
		int []arr ={4,5,23,1,3,9,3};
		
		Arrays.sort(arr,1,5);// 1 to 4
		System.out.println(Arrays.toString(arr));
		Integer []arr1={4,5,23,1,3,9,3};
		Arrays.sort(arr1,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr1));
	}
}