package Kodlama.io.Devs.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.dataAccess.abstracts.LanguageTechnologyRepository;
import Kodlama.io.Devs.dataAccess.abstracts.PLanguageRepository;
import Kodlama.io.Devs.entities.concretes.LanguageTechnology;
import Kodlama.io.Devs.entities.concretes.PLanguage;

@Service
public class CheckService {
	private PLanguageRepository languageRepository;
	private LanguageTechnologyRepository technologyRepository;
	
	@Autowired
	public CheckService(PLanguageRepository languageRepository,LanguageTechnologyRepository technologyRepository) {
		this.languageRepository = languageRepository;
		this.technologyRepository = technologyRepository;
	}
	
	public boolean checkLanguageName(PLanguage language) {
		List<PLanguage> languages = languageRepository.findAll();
		
		for(PLanguage language2: languages) {
			if(language2.getName().equalsIgnoreCase(language.getName())) return false;
		}
		if(language.getName() == null) return false;
		
		return true;
	}
	
	public boolean checkTechnologyName(LanguageTechnology technology) {
		List<LanguageTechnology> technologies = technologyRepository.findAll();
		
		for(LanguageTechnology technology2: technologies) {
			if(technology2.getName().equalsIgnoreCase(technology.getName())) return false;
		}
		if(technology.getName() == null) return false;
		
		return true;
	}
	
}
