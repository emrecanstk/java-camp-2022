package Kodlama.io.Devs.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.concretes.Technology;
import Kodlama.io.Devs.entities.concretes.Language;

@Service
public class CheckService {
	private LanguageRepository languageRepository;
	private TechnologyRepository technologyRepository;
	
	@Autowired
	public CheckService(LanguageRepository languageRepository,TechnologyRepository technologyRepository) {
		this.languageRepository = languageRepository;
		this.technologyRepository = technologyRepository;
	}
	
	public boolean checkLanguageName(String name) {
		List<Language> languages = languageRepository.findAll();
		
		for(Language language2: languages) {
			System.out.println("-"+language2.getName());
			if(language2.getName().equalsIgnoreCase(name)) {
				return false;
			}
		}
		
		if(name == null) {
			return false;
		}
		
		return true;
	}
	
	public boolean checkTechnologyName(String name) {
		List<Technology> technologies = technologyRepository.findAll();
		
		for(Technology technology2: technologies) {
			if(technology2.getName().equalsIgnoreCase(name)) return false;
		}
		if(name == null) return false;
		
		return true;
	}
	
}
