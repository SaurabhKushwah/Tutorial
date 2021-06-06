package InterviewPrograms;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//identify the minimum number in the matrix and find the largest number of from the same column
		/*
		 * 10 13 5
		 * 1 4 9
		 * 1 0 13
		 */
		int c[][] = {{10,13,5},{1,4,9},{1,0,13}};
		
		int minimum = c[0][0]; 
		int row = 0;
		int col = 0;
		int colMax = c[0][col];
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j <3; j++) {
				if(c[i][j] < minimum) {
					minimum = c[i][j];
					row = i;
					col = j;
				}
			}
		}
		System.out.println("The minimum number in the matrix is : "+minimum);
		System.out.println("Indexes are i :" + row);
		System.out.println("Indexes are j :" + col);
		for(int k = 0 ; k < 3 ;k++) {
			if(c[k][col] > colMax) {
				colMax = c[k][col];
			}
		}
		System.out.println("The maximum column value for the cell having min value is : " + colMax);
////////////////////////////////////////////////////////////////////////////////////////////////////		
		int a[][] = {{10,3,5},{1,4,9},{1,9,13}};
		
		//print minimum number in 2 D arrray
		
		int min = a[0][0];
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
//				System.out.println(a[i][j]);
				if (a[i][j] < min) {
					min = a[i][j];
				}
			}
		}System.out.println(min);
		
		//print maximum number in an array
		int b[][] = {{10,3,5},{1,14,9},{1,9,13}};
		
		int max = b[0][0];
		for(int i =0; i<3; i++) {
			for (int j = 0; j <3; j++) {
				if(b[i][j] > max) {
					max = b[i][j];
				}
			}
		}System.out.println("The maximum number in the matrix is : " + max);
	}

}
