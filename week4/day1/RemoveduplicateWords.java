package week4.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class RemoveduplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		Declare a String as "PayPal India"
		String text="PayPal India";

		//		Convert it into a character array
		char[] textchar=text.toCharArray();

		//		Declare a Set as charSet for Character
		Set<Character> charset=new LinkedHashSet<>();

		//		Declare a Set as dupCharSet for duplicate Character
		Set<Character> dupCharSet=new LinkedHashSet<>();

		//		Iterate character array and add it into charSet
		for(int i=0;i<textchar.length;i++)
		{
			if(!charset.add(textchar[i]))
			{
				dupCharSet.add(textchar[i]);
			}
		}
		System.out.println(charset);
		System.out.println(dupCharSet);


		//		Check the dupCharSet elements and remove those in the charSet
		List<Character> dupcharlis=new ArrayList<>(dupCharSet);
		for(int i=0;i<dupcharlis.size();i++)
		{
			if(!charset.add(dupcharlis.get(i)))
			{

				charset.remove(dupcharlis.get(i));

			}
		}
		System.out.println(charset);

		//		Iterate using charSet

		//		Check the iterator variable isn't equals to an empty space

		//		print it


	}

}
