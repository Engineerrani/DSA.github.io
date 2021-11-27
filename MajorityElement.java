package dsa.assignment.java;

public class MajorityElement {
	public static int findMajorityElement(int[] arr) {
		int result = -1;
		int counter = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(counter == 0) {
				result = arr[i];
				counter++;
			} else if (result == arr[i]) {
				counter++;
			} else {
				counter--;
			}
		}
		
		int verify_counter = 0;
		for(int i = 0; i < arr.length; i++) {
			if(result == arr[i]) {
				verify_counter++;
			}
		}
		
		if(verify_counter >= (arr.length / 2))
			return result;
		else
			return Integer.MIN_VALUE;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 8, 7, 4, 18, 21, 2, 2, 12, 11, 10 };
		
//		int[] arr = { 1, 8, 7, 4, 1, 2, 2, 2, 2, 2, 2 };
		 
        System.out.println("The majority element is " + findMajorityElement(arr));

	}


}
