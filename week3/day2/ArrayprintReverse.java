package week3.day2;

import java.util.Arrays;

public class ArrayprintReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {98,97,76,87,90};
		Arrays.sort(scores);
		for(int j=scores.length-1;j>=0;j--)
		{
			System.out.println(scores[j]);
		}

	}

}
