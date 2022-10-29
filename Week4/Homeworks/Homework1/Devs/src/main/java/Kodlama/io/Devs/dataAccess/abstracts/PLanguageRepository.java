package Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.PLanguage;

public interface PLanguageRepository {
	List<PLanguage> getAll();
}
