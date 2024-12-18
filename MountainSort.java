import java.util.Arrays;

public class MountainSort {

	public static void main(String[] args) {
		int[] A= {34, 12, 7, 43, 55, 41, 97, 28, 2, 62};


		System.out.println("Original array: " + Arrays.toString(A));
		System.out.println();

		A = MountainSort(A);

		System.out.println("Array sorted: " + Arrays.toString(A));
	}

	public static int[] MountainSort(int[] A) {
		int n = A.length;
		int temp;
		boolean swapped = true;
		while(swapped){
			swapped = false;
			for(int i = 0; i < n-1; i++){
				if(A[i] > A[i+1]){ //swap if this is true
					temp = A[i+1];
					A[i+1] = A[i];
					A[i] = temp;
					swapped = true;
				}
			}
		}n =-1;

		//creates a temp array of the first half of the main array
		int[] A1;
		A1 = new int[(int) Math.floor(A.length/2)];
		for(int i = 0; i < A1.length; i++){
			A1[i] = A[i];
		}

		//creates a temp array of the second half of the main array
		int[] A2;
		A2 = new int[(int) Math.floor(A.length/2)];
		int c = 0;
		for(int i = A.length-1; i >= (int) Math.floor(A.length/2); i--){
			A2[c] = A[i];
			c += 1;
		}

		//creates a new array of the 2 halves combined and in mountain order
		int[] A3;
		A3 = new int[A.length];
		for(int i = 0; i < (int) Math.floor(A.length/2); i++){
			A3[i] = A1[i];
		}

		for(int i = 0; i < (int) Math.floor(A.length/2); i++){
			A3[i+(int) Math.floor(A.length/2)] = A2[i];
		}

		return A3; //returns the sorted array
	}

	//you can add your own functions if you want

}
