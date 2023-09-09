package w3d2.arrayassign;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		int count= data.length;
		System.out.println("Second Largest number in the array is : "+data[count-2]);
	}

}
