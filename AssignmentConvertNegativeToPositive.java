package week1.day2;

public class AssignmentConvertNegativeToPositive {

	public static void main(String[] args) {
		int num = -50;
		if(num<0) {
			int positive = num * -1;
			System.out.println("The number is converted to Positive" + positive);
		}
		else {
			System.out.println("Number cannot be converetd");
		}

	}

}
