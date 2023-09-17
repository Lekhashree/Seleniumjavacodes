package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatewithSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String companyName = "google";
		char[] arr=companyName.toCharArray();
		Set<Character> avoiddup= new LinkedHashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			avoiddup.add(arr[i]);
		}
		System.out.println(avoiddup);

		String output="";
		for(Character each:avoiddup)
		{
			output=output+each;
		}

		System.out.println(output);

	}
}
