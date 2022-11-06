package Kodlama.io.Devs.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.dataAccess.abstracts.PLanguageRepository;
import Kodlama.io.Devs.entities.concretes.PLanguage;

@Service
public class CheckService {
	private PLanguageRepository languageRepository;
	
	@Autowired
	public CheckService(PLanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	public boolean checkName(PLanguage language) {
		List<PLanguage> languages = languageRepository.findAll();
		
		for(PLanguage language2: languages) {
			if(language2.getName().equalsIgnoreCase(language.getName())) return false;
		}
		if(language.getName() == null) return false;
		
		return true;
	}
}
