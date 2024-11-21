// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int N = Integer.parseInt(args[0]);
		String mode = args[1];
		for (int i = 1; i <= N; i++) {
			int seed = i, counter = 1;
			String seedsString = seed + " ";
			do {
				if (seed % 2 == 0) {
					seed /= 2;
				}
				else {
					seed = (seed * 3) + 1;
				}
				seedsString += seed + " ";
				counter ++;
			} while(seed != 1);
			if (mode.equals("v")) {
				System.out.println(seedsString + "(" + counter + ")");
			}	
		}
		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}
}
