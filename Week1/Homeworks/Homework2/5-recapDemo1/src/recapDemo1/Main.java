package recapDemo1;

// https://www.youtube.com/playlist?list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8
// "JAVA Dersleri"
// Lesson 9

public class Main {

	public static void main(String[] args) {
		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 = 2;
		
		if(sayi1 > sayi2 && sayi1 > sayi3) {
			System.out.println("En buyuk: "+sayi1);
		}
		if(sayi2 > sayi1 && sayi2 > sayi3) {
			System.out.println("En buyuk: "+sayi2);
		}
		if(sayi3 > sayi2 && sayi3 > sayi1) {
			System.out.println("En buyuk: "+sayi3);
		}

	}

}
