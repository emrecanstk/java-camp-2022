package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.PLanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.PLanguageRepository;
import Kodlama.io.Devs.entities.concretes.PLanguage;

@Service
public class PLanguageManager implements PLanguageService{
	
	private PLanguageRepository languageRepository;
	
	@Autowired
	public PLanguageManager(PLanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	@Override
	public List<PLanguage> getAll() {
		return languageRepository.getAll();
	}

	@Override
	public PLanguage getById(int id) {
		return languageRepository.getById(id);
	}

	@Override
	public void add(PLanguage language) throws Exception {
		ValEmpty(language);
		languageRepository.add(language);
	}

	@Override
	public void update(PLanguage language) throws Exception {
		ValEmpty(language);
		languageRepository.update(language);
	}

	@Override
	public void delete(int id) {
		languageRepository.delete(id);
	}
	
	private void ValEmpty(PLanguage language) throws Exception {
		if(language.getName() == "")
			throw new Exception("Programming language field must not empty!");
		var pLanguages = languageRepository.getAll();
		
		for (PLanguage language1 : pLanguages) {
			if (language1.getName().equals(language1.getName())) {
				throw new Exception("This programming language is already exist.");
			}
		}
	}
	
}
