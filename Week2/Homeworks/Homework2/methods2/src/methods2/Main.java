package methods2;

// https://www.youtube.com/playlist?list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8
// "JAVA Dersleri"
// Lesson 27 

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";

		int sayi = topla(15, 4);
		System.out.println(sayi);

		int toplam = topla2(2, 3, 8, 7, 6, 4, 5);
		System.out.println(toplam);
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void guncelle() {
		System.out.println("Güncellendi");
	}

	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

}
