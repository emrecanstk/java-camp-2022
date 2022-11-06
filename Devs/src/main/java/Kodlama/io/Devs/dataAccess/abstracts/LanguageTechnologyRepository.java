package Kodlama.io.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlama.io.Devs.entities.concretes.LanguageTechnology;

public interface LanguageTechnologyRepository extends JpaRepository<LanguageTechnology, Integer> {

}
