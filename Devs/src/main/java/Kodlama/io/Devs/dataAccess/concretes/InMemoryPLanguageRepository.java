package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.dataAccess.abstracts.PLanguageRepository;
import Kodlama.io.Devs.entities.concretes.PLanguage;

@Repository
public class InMemoryPLanguageRepository implements PLanguageRepository {
	
	List<PLanguage> pLanguages;
	
	public InMemoryPLanguageRepository() {
		pLanguages = new ArrayList<PLanguage>();
		pLanguages.add(new PLanguage(1, "Java"));
		pLanguages.add(new PLanguage(2, "C#"));
		pLanguages.add(new PLanguage(3, "Python"));
		pLanguages.add(new PLanguage(4, "Javascript"));
		pLanguages.add(new PLanguage(5, "Dart"));
		pLanguages.add(new PLanguage(6, "Kotlin"));
		pLanguages.add(new PLanguage(7, "Swift"));
		pLanguages.add(new PLanguage(8, "Flutter"));
		pLanguages.add(new PLanguage(9, "C/C++"));
		pLanguages.add(new PLanguage(10, "R"));
		pLanguages.add(new PLanguage(11, "Fortran"));
		pLanguages.add(new PLanguage(12, "Matlab"));
		pLanguages.add(new PLanguage(13, "HTML"));
	}
	
	@Override
	public List<PLanguage> getAll() {
		return pLanguages;
	}

	@Override
	public PLanguage getById(int id) {
		PLanguage languageById = null;
		
		for(PLanguage lang: pLanguages) {
			if(lang.getId() == id) languageById = lang;
		}
		if(languageById != null) return languageById;
		throw null;
	}

	@Override
	public void add(PLanguage language) {
		int lastId = pLanguages.get(pLanguages.size() - 1).getId();
		language.setId(lastId + 1);
		pLanguages.add(language);
	}

	@Override
	public void update(PLanguage language) {
		for (PLanguage lang: pLanguages) {
			if(lang.getId() == language.getId()) {
				lang.setName(language.getName());
				break;
			}
		}
	}

	@Override
	public void delete(int id) {
		PLanguage deleteTo = getById(id);
		if(deleteTo != null) {
			pLanguages.remove(deleteTo);
			return;
		}
		throw null;
	}
	
}
