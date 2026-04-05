package arrayProjects;

public class additionOfArray {
	
	public static void main(String[] args) {
		int[] x = {1,2,3,4};
		
		for (int i : x) {
			for (int space = 3; space >=i; space--) {
				System.out.print("");
			}
			for(int ast=1; ast <=i; ast++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}
}
