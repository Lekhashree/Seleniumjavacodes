package w3d2.arrayassign;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		System.out.println("Duplicate values in the array: ");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int k=i+1;k<arr.length-1;k++)
			{
			
			if(arr[i]==arr[k])
			{
				System.out.println(arr[i]);
			}
			}
		
		}

	}

}
