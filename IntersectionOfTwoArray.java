package dsa.assignment1.java;

public class IntersectionOfTwoArray {
	public static void main(String[] args) {
		int myArray1[]= {21,34,24,12,67};
		int myArray2[]= {45,56,87,54,98};
		System.out.println("Intersection of the two arrays ::");
		for(int i=0; i<myArray1.length; i++) {
			for(int j=0; j<myArray2.length;j++) {
				if(myArray1[i]==myArray2[j]);
				System.out.println(myArray2[j]);
			}
		}
	}

}
