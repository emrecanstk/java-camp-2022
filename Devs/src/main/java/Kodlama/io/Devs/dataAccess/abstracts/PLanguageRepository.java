package Kodlama.io.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlama.io.Devs.entities.concretes.PLanguage;

public interface PLanguageRepository extends JpaRepository<PLanguage, Integer> {

}
