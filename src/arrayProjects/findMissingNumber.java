package arrayProjects;



//import java.util.Iterator;

public class findMissingNumber {

	public static void main(String[] args) {
		// find missing number in an array of 1 to 100
		//Find second largest number in an array
		//Find duplicate number in an array
		
		int [] arr = {3,5,12,13,17};
		
	/*	for (int i = 0; i < arr.length-1; i++) {
			for (int j = arr[i]+1; j < arr[i+1]; j++) {
				System.out.print(j+",");
			}
			System.out.println();
		} //find missing number...
	*/
		
	/*	 int largest = arr[0]; 
		 for(int i=1; i< arr.length; i++) { 
			 if (arr[i] >largest) {
				 largest = arr[i]; // Up  date largest if current element is greater
			 } 
		 }
		 System.out.println("The largest number is: " + largest); // Find the largest number
	*/ 
		
		for (int i = 0; i < arr.length; i++) {
		    for (int j = i + 1; j < arr.length; j++) {
		    	System.out.print(j+",");
			}
			System.out.println();
		}

		
	}

}
