package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=11, firstnum=0,secnum=1,sum;
		System.out.println("***Fibonacci Series***");
		System.out.println(firstnum);
		for(int i=1;i<range;i++)
		{
			sum = firstnum+secnum;
			firstnum=secnum;
			secnum= sum;
			System.out.println(firstnum);
			
		}
	}

}
