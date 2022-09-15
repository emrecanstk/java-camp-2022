package conditionals;

// https://www.youtube.com/playlist?list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8
// "JAVA Dersleri"
// Lesson 8

public class Main {

	public static void main(String[] args) {
		int sayi = 50;
		
		if(sayi<20) {
			System.out.println(sayi+" 20'den küçüktür.");
		}
		else if(sayi>20) {
			System.out.println(sayi+" 20'den büyüktür.");
		}
		else {
			System.out.println(sayi+" 20'ye eşittir.");
		}

	}

}
