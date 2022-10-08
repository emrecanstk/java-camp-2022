package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla();                  // gövdesi nerede yazılırsa o şekilde çalışacak olan bir method.

	public final void gameOver() {                   // herkes için ortak. zorunlu bir method.  - final ile override olanağı kaldırıldı
		System.out.println("Oyun bitti.");
	}
}


// dolayısıyla kim bu sınıfı miras alıyor ise hesapla'yı override etmek zorunda!
// gameOver'ı ise aynen kullanmak zorunda.

// NOT: abstract sınıflar asla new'lenemez (nesneleri oluşturulamaz)