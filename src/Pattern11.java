// Write a program to print the following pattern: 
//                a
//               aba
//              abcba
//               aba
//                a  

class Pattern11 {
	public static void main(String[] args) {		 //// Main Method
		for (int i = 0; i <= 4; i++) { 				// Applying for loop
			for (int j = 0; j <= 4; j++) {			// Applying for loop
				if (i == 0 && j == 2 || i == 1 && j == 1 || i == 1 && j == 3 || i == 2 && j == 0 || i == 2 && j == 4 // logic
																														// if
																														// logic

						|| i == 3 && j == 1 || i == 3 && j == 3 || i == 4 && j == 2)
					System.out.print("a"); // for output on the screen
				else if (i == 1 && j == 2 || i == 2 && j == 1 || i == 2 && j == 3 || i == 3 && j == 2) // else
																										// condition
					System.out.print("b"); // for output on the screen
				else if (i == 2 && j == 2) // else condition
					System.out.print("c"); // for output on the screen
				else // else condition
					System.out.print(" "); // for output on the screen

			}
			System.out.println(" "); // for output on the screen
		}
	}
}
