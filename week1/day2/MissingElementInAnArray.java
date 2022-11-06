package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		int count = 0;
		
		Arrays.sort(arr);
		for (int i = 0; i <= arr.length; i++)
		{
			count++;
			if (arr[i] != count)
			{
				System.out.println(count);
				break;
			}

		}

	}
}
