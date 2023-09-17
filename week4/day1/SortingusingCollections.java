package week4.day1;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class SortingusingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] compname= {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		Set<String> nameset=new TreeSet<>(Collections.reverseOrder());
		for(int i=0;i<compname.length;i++)
		{
			nameset.add(compname[i]);
		}
		System.out.println(nameset);
	}

}
