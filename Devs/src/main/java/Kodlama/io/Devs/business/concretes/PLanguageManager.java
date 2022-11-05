package Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.PLanguageService;
import Kodlama.io.Devs.business.requests.CreatePLanguageRequest;
import Kodlama.io.Devs.business.requests.UpdatePlanguageRequest;
import Kodlama.io.Devs.business.responses.GetAllPLanguagesResponse;
import Kodlama.io.Devs.business.responses.GetPLanguageByIdResponse;
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
	public void add(CreatePLanguageRequest createPLanguageRequest) throws Exception {
		PLanguage language = new PLanguage();
		language.setName(createPLanguageRequest.getName());
		
		this.languageRepository.save(language);
	}

	@Override
	public void update(UpdatePlanguageRequest updatePlanguageRequest, int id) throws Exception {
		PLanguage languege=languageRepository.getReferenceById(id);
		languege.setName(updatePlanguageRequest.getName());
	    languageRepository.save(languege);
	}

	@Override
	public void deleteById(int id) {
		languageRepository.deleteById(id);
	}
	
}
