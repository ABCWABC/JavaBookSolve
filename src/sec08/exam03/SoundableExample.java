package sec08.exam03;

public class SoundableExample {
	
	private static void printSound(Soundable s) {
		System.out.println(s.sound());
	}

	public static void main(String[] args) {

		printSound(new Cat());
		printSound(new Dog());
		
	}

}
