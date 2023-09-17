package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargestWithSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> setarr=new TreeSet<>();
		for(int i=0;i<data.length;i++)
		{
			setarr.add(data[i]);
		}
		System.out.println(setarr);
		int size=setarr.size();
		List<Integer> lists=new ArrayList<>(setarr);
		System.out.println("SecondLargest number is: "+lists.get(size-2));

	}

}
