package arrayProjects;

public class swapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] number = {5,6};
		System.out.println("Before swapping: a = " + number[0] + ", b = " + number[1]);
		swapArray(number);
		
		System.out.println("after swapping: a = " + number[0] + ", b = " + number[1]);

	}

	private static void swapArray(int[] number) {
		// TODO Auto-generated method stub
		int temp = number[0];
		number[0] = number[1];
		number[1] = temp;
		
	}

}
