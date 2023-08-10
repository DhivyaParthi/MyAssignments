package week1.day3Assignments;

import java.util.Arrays;

public class AssignmentSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		int ans = data.length - 1;
		int secl = ans-1;
		System.out.println(data[secl]);
	} 

}
