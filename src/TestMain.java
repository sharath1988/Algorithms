

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestMain {

	@SuppressWarnings("resource")
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		try {
		System.out.println("Enter c value ");
		int c = scanner.nextInt();
		System.out.println("Enter N value ");
		int N = scanner.nextInt();

		if (c > N) {
			System.out.println("c cannot be greater than N");
			scanner.close();
			return;

		}
		if (c < 0) {
			System.out.println("c cannot be less than 0");
			scanner.close();
			return;

		}
		if (N > 300 || N < 0) {
			System.out.println("N cannot be greater than 300 and cannot be less than 0");
			scanner.close();
			return;

		}
		System.out.println("c value is " + c);
		System.out.println("N value is " + N);
		System.out.println("");
		NumberFunction obj = new NumberFunction();
		System.out.println("using the first "+ N +" values from TEST.PRN.txt text file in project location to create matrix... ");
		
		// make array from file provided
		float input[] = new float[N];
			scanner = new Scanner(obj.getFile("TEST.PRN.txt"));
		int idx = 0;
		while (scanner.hasNextLine() && idx<N) {
			Float i = scanner.nextFloat();
			input[idx] = i;
			idx++;
		}
		
		obj=new NumberFunction(c, N, input); 
		printoutout(obj.getMatrix());
		
		System.out.println("");
		System.out.println("Do you want to provide your own input values ? input 'Y' or 'N' and enter");
		scanner = new Scanner(System.in);
		String inOpt = scanner.next();
		if(inOpt.equalsIgnoreCase("N"))
		{
			return;
		}
		else if(inOpt.equalsIgnoreCase("Y"))
		{
			System.out.println("Enter the floating point values one after other");
			float userInput[] = new float[N];
			for (int inp=0;inp<N;inp++) {
				int index=inp+1;
				System.out.println("Enter the "+ index +" floating point value");
				Float inputNumber = scanner.nextFloat();
				userInput[inp] = inputNumber;
			}
			
			obj=new NumberFunction(c, N, userInput); 
			printoutout(obj.getMatrix());
		}
		else
		{
			System.out.println("Invalid option");
			return;
		}
		

	}
	 catch (FileNotFoundException e) {
		 System.out.println("file not found");
	} finally
	 {
		scanner.close();
	 }

}

	private static void printoutout(float[][] matrix) {
				System.out.println("");
				for (float[] row : matrix) {
					for (Float i : row) {
						System.out.print(i);
						System.out.print("\t");
					}
					System.out.println();
				}
				System.out.println("");
				System.out.println("above matrix formatted upto 6 decimal points matching the results provided");
				System.out.println("");
				for (float[] row : matrix) {
					for (Float i : row) {
						System.out.print( String.format("%.6f",i));
						System.out.print("\t");
					}
					System.out.println();
				}
		
	}
	
}
