package kodlama.io.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACar.entities.concretes.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer> { 
	// Spring JPA sayesinde bir çok getirme, götürme fonksiyonları bize sağlanır.
	
}
