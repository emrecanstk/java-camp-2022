package overriding;

public class OgrenciKrediManager extends BaseKrediManager {
	public double hesapla(double tutar) { // BaseKrediManager'deki hesapla metodunu geçersiz kıldık / üzerine yazdık.
		return tutar * 1.1;
	}
}
