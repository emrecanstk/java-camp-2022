package kodlama.io.rentACar.dataAccess.abstracts;

import java.util.List;

import kodlama.io.rentACar.entities.concretes.Brand;

public interface BrandRepository {  // BrandDao ile aynıdır
	List<Brand> getAll();        // geri dönüş tipi: Brand tipinde elemanlar taşıyan liste
	
	
}
