package week3.day2;

public class AxisBank extends BankInfo {
	@Override
	public void deposit()
	{
		System.out.println("This is from class AxisBank Deposit()");
	}
	public static void main(String args[])
	{
		AxisBank ab=new AxisBank();
		ab.deposit();
	}

}
