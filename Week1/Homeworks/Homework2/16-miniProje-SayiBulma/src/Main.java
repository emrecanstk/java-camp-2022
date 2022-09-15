
// https://www.youtube.com/playlist?list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8
// "JAVA Dersleri"
// Lesson 23

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 5;
		boolean varMi=false;
		
		for(int sayi: sayilar) {
			if(sayi==aranacak) {
				varMi = true;
				break;
			}
		}
		
		if(varMi) {
			System.out.println("sayı vardır");
		}
		else {
			System.out.println("sayı yoktur");
		}

	}

}
