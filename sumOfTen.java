
// import the arrayList statement
import java.util.ArrayList;

// This program adds ten numbers in arrays and arrayLists

public class sumOfTen {

	public static void main(String[] args) {
		
		// create array variable with ten spaces, store, and print sum of the ten numbers
		final int TEN_NUMBERS = 10;
		int[] values = new int[TEN_NUMBERS];
		for (int i = 0; i < values.length; i++)
		{
			values[i] = i+1;
		}
		int total = 0;
		for (int element : values)
		{
			System.out.println(element);
			total = total + element;
		}
		System.out.println("The sum of the first ten numbers, using an array, is: " + total);

		// create arrayList and do the same
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for (int i = 1; i <= TEN_NUMBERS; i++)
		{
			nums.add(i);
		}
		int totalArrayList = 0;
		for (int element : nums)
		{
			System.out.println(element);
			totalArrayList = totalArrayList + element;
		}
		System.out.println("The sum of the first ten numbers, using an arrayList, is: " + totalArrayList);
		
	}

}
