package week4.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveduplicateStringwithSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1 java java java";
		String[] strarr=text.split(" ");
		System.out.println(strarr[1]);
		Set<String> strset=new LinkedHashSet<>();
		for(int i=0;i<strarr.length;i++) {
			strset.add(strarr[i]);
			
		}
		System.out.println(strset);
		List<String> strlis=new ArrayList<>(strset);
		String fulltext= "";
		for(int i=0;i<strlis.size();i++)
		{
			String temp=strlis.get(i).toString();
			fulltext= fulltext+" "+temp;
		}
		System.out.println(fulltext);
	}

}
