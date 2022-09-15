package switchDemo;

// https://www.youtube.com/playlist?list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8
// "JAVA Dersleri"
// Lesson 10

public class Main {

	public static void main(String[] args) {
		char grade = 'A';
		
		switch(grade) {
			case 'A':
				System.out.println("Mühemmel : Geçtiniz");
				break;
			case 'B':
				System.out.println("Çok iyi : Geçtiniz");
				break;
			case 'C':
				System.out.println("İyi : Geçtiniz");
				break;
			case 'D':
				System.out.println("Fena değil : Geçtiniz");
				break;
			case 'F':
				System.out.println("Maalesef : Kaldınız");
				break;
			default:
				System.out.println("Geçersiz!");
			
			
		}

	}

}
