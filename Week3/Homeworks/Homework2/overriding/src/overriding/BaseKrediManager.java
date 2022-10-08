package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {       // eğer hiçbir yerde override edilmesini istemiyorsak
		return tutar * 1.18;                          // final anahtar kelimesini kullanabiliriz.
	}
}
