package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.PLanguage;

public interface PLanguageService {
	List<PLanguage> getAll();
	PLanguage getById(int id);
	void add(PLanguage language) throws Exception;
	void update(PLanguage language) throws Exception;
	void delete(int id);
}
