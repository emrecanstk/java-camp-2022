package Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.PLanguage;

public interface PLanguageRepository {
	List<PLanguage> getAll();
	PLanguage getById(int id);
	void add(PLanguage language);
	void update(PLanguage language);
	void delete(int id);
}
