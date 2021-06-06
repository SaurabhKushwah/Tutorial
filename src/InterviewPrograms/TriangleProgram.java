package InterviewPrograms;

public class TriangleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1 2 3 4
		 *5 6 7
		 *8 9
		 *10
		 */
		int a = 0;
		
		for(int i = 5 ; i >= 1 ; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(++a + "\t");
			}
			System.out.println();
		}
		
		/*
		 * 1
		 * 2 3
		 * 4 5 6
		 * 7 8 9 10
		 */
		int b = 0;
		for (int i= 0; i < 4; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print(++b + "\t");
			}
			System.out.println("");
		}
		
		/*
		 * 1
		 * 1 2
		 * 1 2 3
		 * 1 2 3 4
		 */
		for (int i =1; i <= 5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j + "\t");
			}System.out.println("");
		}
		
		/*
		 * 3
		 * 3 6
		 * 9 12 15
		 * 18 21 24
		 */
		int k=1;
		for (int i= 0; i <5; i++) {
			for (int j=0; j<i; j++) {
				System.out.print(k*3 + "\t");
				k++;
			}System.out.println("");
		}

	}

}
