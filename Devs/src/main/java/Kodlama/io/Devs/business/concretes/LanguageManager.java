package Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import Kodlama.io.Devs.business.responses.GetAllPLanguagesResponse;
import Kodlama.io.Devs.business.responses.GetPLanguageByIdResponse;
import Kodlama.io.Devs.core.CheckService;
import Kodlama.io.Devs.dataAccess.abstracts.PLanguageRepository;
import Kodlama.io.Devs.entities.concretes.PLanguage;

@Service
public class LanguageManager implements LanguageService{
	
	private PLanguageRepository languageRepository;
	private CheckService checkService;
	
	@Autowired
	public LanguageManager(PLanguageRepository languageRepository,CheckService checkService) {
		this.languageRepository = languageRepository;
		this.checkService = checkService;
	}
	
	@Override
	public List<GetAllPLanguagesResponse> getAll() {
		
		List<PLanguage> pLanguages = languageRepository.findAll();
		List<GetAllPLanguagesResponse> languagesResponse = new ArrayList<GetAllPLanguagesResponse>();
		
		for(PLanguage language: pLanguages) {
			GetAllPLanguagesResponse responseItem = new GetAllPLanguagesResponse();
			responseItem.setId(language.getId());
			responseItem.setName(language.getName());
			languagesResponse.add(responseItem);
		}
		
		
		return languagesResponse;
	}

	@Override
	public GetPLanguageByIdResponse getById(int id) throws Exception {
		List<PLanguage> languages = languageRepository.findAll();
		GetPLanguageByIdResponse responseItem = null;
		
		for(PLanguage language: languages) {
			if(language.getId() == id) {
				responseItem = new GetPLanguageByIdResponse();
				responseItem.setName(language.getName());
				responseItem.setId(language.getId());
			}
		}
		
		if(responseItem == null) throw new Exception("We could not find this id: "+id);
		
		return responseItem;
	}

	@Override
	public void add(CreateLanguageRequest createLanguageRequest) throws Exception {
		PLanguage language = new PLanguage();
		language.setName(createLanguageRequest.getName());
		
		if(checkService.checkLanguageName(language)) {
			this.languageRepository.save(language);
		} else {
			throw  new Exception("Check this name. The name can not be empty or already exist.");
		}
		
	}

	@Override
	public void update(UpdateLanguageRequest updateLanguageRequest, int id) throws Exception {
		PLanguage language=languageRepository.getReferenceById(id);
		language.setName(updateLanguageRequest.getName());
		
		if(checkService.checkLanguageName(language)) {
			languageRepository.save(language);
		} else {
			throw  new Exception("Check this name. The name can not be empty or already exist.");
		}
	    
	}

	@Override
	public void deleteById(int id) {
		boolean isExist = languageRepository.existsById(id);
		
		if(isExist) languageRepository.deleteById(id);
	}
	
}
