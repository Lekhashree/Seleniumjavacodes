package w3d2.stringassign;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="madam";
		String rev="";
		char[] arr=name.toCharArray();
		for(int i=arr.length-1;i>=0;i--)
		{
			rev= rev+arr[i];

		}
		if(name.equalsIgnoreCase(rev))
		{
			System.out.println("The given String "+name+" is palindrome");
		}
		else
		{
			System.out.println("The given String "+name+" is not palindrome");
		}

	}

}
