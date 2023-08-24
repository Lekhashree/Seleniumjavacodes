package week1.day2;

public class CheckPrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =37,temp;
		boolean flag = false;
		for(int i=2; i<=num/2;i++)
		{
			temp= num%i;
			if(temp==0)
			{
				flag=true;
				break;
				
			}
		}
		if(flag==true)
			System.out.println("The given number "+num+" is not prime");
		else
			System.out.println("The given number "+num+" is prime");
	}

}
