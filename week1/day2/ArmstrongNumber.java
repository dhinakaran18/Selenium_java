package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int a = 153;
		int calculated;
		int remainder = 0;
		int orginal = 0;
		int t = 0;

		orginal = a;

		while (orginal > 0) {
			calculated = 0;
			calculated = orginal % 10;
			remainder = orginal / 10;
			orginal = remainder; 
			t = t + (calculated * calculated * calculated);

		}

		if (t == a) {
			System.out.println(+t+ " the number is armstrong");
		}
		else 
		{
			System.out.println(+a+ " the given number is not armstrong");
		}
	}
}
