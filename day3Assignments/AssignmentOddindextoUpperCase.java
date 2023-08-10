package week1.day3Assignments;

public class AssignmentOddindextoUpperCase {

	public static void main(String[] args) {
		String test = "changeme";

		//convert String to Character - parsing
		char[] c = test.toCharArray();
		for(int i = 0 ; i<c.length; i++) {
			if(i %2 != 0) {
				char upc = Character.toUpperCase(c[i]);
				
				System.out.print(upc);
			
			} else {
				System.out.print(c[i]);
			}
		}

	}

}
