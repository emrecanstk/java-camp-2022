package Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import Kodlama.io.Devs.business.responses.GetAllLanguagesResponse;
import Kodlama.io.Devs.business.responses.GetLanguageByIdResponse;
import Kodlama.io.Devs.core.CheckService;
import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService{
	
	private LanguageRepository languageRepository;
	private CheckService checkService;
	
	@Autowired
	public LanguageManager(LanguageRepository languageRepository,CheckService checkService) {
		this.languageRepository = languageRepository;
		this.checkService = checkService;
	}
	
	@Override
	public List<GetAllLanguagesResponse> getAll() {
		
		List<Language> languages = languageRepository.findAll();
		List<GetAllLanguagesResponse> languagesResponse = new ArrayList<GetAllLanguagesResponse>();
		
		for(Language language: languages) {
			GetAllLanguagesResponse responseItem = new GetAllLanguagesResponse();
			responseItem.setId(language.getId());
			responseItem.setName(language.getName());
			languagesResponse.add(responseItem);
		}
		
		
		return languagesResponse;
	}

	@Override
	public GetLanguageByIdResponse getById(int id) throws Exception {
		List<Language> languages = languageRepository.findAll();
		GetLanguageByIdResponse responseItem = null;
		
		for(Language language: languages) {
			if(language.getId() == id) {
				responseItem = new GetLanguageByIdResponse();
				responseItem.setName(language.getName());
				responseItem.setId(language.getId());
			}
		}
		
		if(responseItem == null) throw new Exception("We could not find this id: "+id);
		
		return responseItem;
	}

	@Override
	public void add(CreateLanguageRequest createLanguageRequest) throws Exception {
		Language language = new Language();
		language.setName(createLanguageRequest.getName());
		
		if(checkService.checkLanguageName(language.getName())) {
			this.languageRepository.save(language);
		} else {
			throw  new Exception("Check this name. The name can not be empty or already exist.");
		}
		
	}

	@Override
	public void update(UpdateLanguageRequest updateLanguageRequest, int id) throws Exception {
		
		Language language=languageRepository.getReferenceById(id);
		
		if(checkService.checkLanguageName(updateLanguageRequest.getName())) {
			language.setName(updateLanguageRequest.getName());
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
