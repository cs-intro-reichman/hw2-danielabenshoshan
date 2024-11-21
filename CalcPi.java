// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int Ntimes = Integer.parseInt(args[0]);
		double sum = 0.0;
		for (int i = 0; i < Ntimes ; i++){
			if (i % 2 == 0) { 
                sum += 1.0 / (2 * i + 1);
            } else {
                sum -= 1.0 / (2 * i + 1);
            }
		}
		double piApproximation = sum * 4;
		double piJava = Math.PI;

		System.out.println("pi according to Java: " + piJava);
		System.out.println("pi, approximated:     " + piApproximation);

	}
}
