import java.util.*;
import java.lang.Math;

public class WeirdCalc

{
	public static void main (String[] args)
	{
		Scanner userinput = new Scanner (System.in);

		int Num1, Num2;
		Num1 = 0;
		Num2 = 0;

		System.out.print("Give me a number: ");
		Num1 = userinput.nextInt();

		System.out.print("Give me another number: ");
		Num2 = userinput.nextInt();

		System.out.printf("\nSum: %10d", (Num1 + Num2));
		System.out.printf("\nDifference: %3d", (Num1 - Num2));
		System.out.printf("\nProduct: %6d", (Num1 * Num2));
		System.out.printf("\nAverage: %9.2f", ((Num1 + Num2)/2.0));
		System.out.printf("\nDistance: %5d", (Math.abs(Num1 - Num2)));
		System.out.printf("\nMaximum: %6d", Math.max(Num1, Num2));
		System.out.printf("\nMinimum: %6d", Math.min(Num1, Num2));
	}
}





