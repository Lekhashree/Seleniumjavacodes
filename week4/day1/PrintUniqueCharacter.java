package week4.day1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Lekhaa";
		char[] allchar=name.toCharArray();
		Set<Character> charset=new LinkedHashSet<>();
		for(int i=0;i<allchar.length;i++)
		{
			charset.add(allchar[i]);
		}
		
		System.out.println(charset);

	}

}
