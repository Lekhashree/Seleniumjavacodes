package week3.day1;

public class Execution extends MultipleLangauge implements TestTool,Language {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Execution exe = new Execution();
		exe.python();
		exe.selenium();
		exe.java();
		exe.ruby();
	}

	@Override
	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Implemented testtool interface method selenium()");
	}

	@Override
	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Implemented Language interface method java()");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Inside Absract class Multiple Language and method ruby() -- Unimplemented");
	}

	@Override
	public void python()
	{
		System.out.println("This method python() has been overriden in Execution class ");
	}
}
