package week1.day2;

public class AssignmentFibonnaci {

	public static void main(String[] args) {
		int fnum = 0;
		int snum=1;
		System.out.println("The First number is" + fnum);
		System.out.println("The Second number is" + snum);
		for(int i=1;i<=8;i++) {
			int sum = fnum + snum ;
			fnum = snum;
			snum = sum;
			System.out.println("The Fionacci series for range 8 is" + sum );
		}
		

	}

}
