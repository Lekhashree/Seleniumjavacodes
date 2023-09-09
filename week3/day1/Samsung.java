package week3.day1;

public class Samsung extends AndroidTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samsung s =new Samsung();
		s.openApp();
		s.watchVideo();

	}

	@Override
	public void watchVideo() {
		// TODO Auto-generated method stub
		System.out.println("inside watchvideo");
	}

}
