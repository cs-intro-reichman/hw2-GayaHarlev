
public class CalcPi {
	public static void main(String [] args) { 
	    int N = Integer.parseInt(args[0]);

		System.out.println("pi according to Java: " + Math.PI);

		double sum = 0.0;

		for (int i = 0; i < N ; i++) { 
			double term = 1.0 / (2 * i + 1);

			if (i % 2 == 0){
				sum+= term; 
			}

			else {
				sum-= term;
			}
		}

		double approximatedPi = sum * 4;
		System.out.println("pi, approximated:     " + approximatedPi);
	}
}
