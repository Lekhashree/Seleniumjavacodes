package week3.day2;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student s= new Student();
	s.getStudentInfo(34);
	s.getStudentInfo(34, "Lekha");
	s.getStudentInfo("test@gmail.com", 123456789);

	}
	public void getStudentInfo(int id)
	{
		System.out.println("Inside method with one parameter, id "+id);
	}
	public void getStudentInfo(int id,String name)
	{
		System.out.println("Inside method with 2 parameter: id "+id+" name: "+name);
	}
	public void getStudentInfo(String email,double phonenumber)
	{
		System.out.println("Inside method with email and phonenumber rgument: Email "+email+" phonenumber "+phonenumber);
	}
}
