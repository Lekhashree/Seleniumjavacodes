package w3d2.stringassign;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char arr[]= test.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if((i%2)==0)
			{
				System.out.print(arr[i]);
				
			}
			else
			{
				System.out.print(Character.toUpperCase(arr[i]));
				
			}
		}
	}

}
