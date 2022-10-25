package kodlama.io.rentACar.business.concretes;

import java.util.List;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

public class BrandManager implements BrandService {
	private BrandRepository brandRepository;
	
	
	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}

	@Override
	public List<Brand> getAll() {
		// iş kuralları buraya yazılacak
		
		return brandRepository.getAll();
	}
	
}
