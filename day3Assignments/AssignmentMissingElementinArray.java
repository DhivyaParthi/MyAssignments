package week1.day3Assignments;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AssignmentMissingElementinArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8}; // 1 2 3 4 6 7 8
		Arrays.sort(arr);
		for(int i = 0; i< arr.length; i++) {
			if(i!= arr[i]) {
				System.out.println(i);
				break;
				
			} 
			
				
		}
	}

}
