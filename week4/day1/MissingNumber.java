package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,4,6,8,9,2,3,7,10,1,2};
		Set<Integer> setarray=new TreeSet<>();
		for(int i=0;i<arr.length;i++)
		{
			setarray.add(arr[i]);
		}
		//System.out.println(setarray);
		List<Integer> arrlis=new ArrayList<>(setarray);
		for(int i=0;i<arrlis.size();i++)
		{
			//System.out.println(arrlis.get(i));
			if((i+1)!=arrlis.get(i))
			{
				System.out.println("Missing number is : "+(i+1));
				break;
			}
		}
		
	}

}
