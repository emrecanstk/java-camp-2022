package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import Kodlama.io.Devs.dataAccess.abstracts.PLanguageRepository;
import Kodlama.io.Devs.entities.concretes.PLanguage;

public class InMemoryPLanguageRepository implements PLanguageRepository {
	
	List<PLanguage> pLanguages;
	
	public InMemoryPLanguageRepository() {
		pLanguages = new ArrayList<PLanguage>();
		pLanguages.add(new PLanguage(1,"Java"));
		pLanguages.add(new PLanguage(2,"C#"));
		pLanguages.add(new PLanguage(3,"Python"));
		pLanguages.add(new PLanguage(4,"SQL"));
		pLanguages.add(new PLanguage(5,"C/C++"));
		pLanguages.add(new PLanguage(6,"Kotlin"));
		pLanguages.add(new PLanguage(7,"Flutter"));
		pLanguages.add(new PLanguage(8,"Swift"));
		pLanguages.add(new PLanguage(9,"Dart"));
	}
	
	@Override
	public List<PLanguage> getAll() {
		
		return pLanguages;
	}
	
}
