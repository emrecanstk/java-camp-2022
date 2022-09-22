package methods;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 6;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}

		String mesaj;

		if (varMi) {
			mesaj = "Sayı mevcuttur: " + aranacak;
			mesajVer(mesaj);
		} else {
			System.out.println("Sayı mevcut değildir: " + aranacak);
		}

	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
