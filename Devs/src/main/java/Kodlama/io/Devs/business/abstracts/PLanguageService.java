package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.business.requests.CreatePLanguageRequest;
import Kodlama.io.Devs.business.requests.UpdatePlanguageRequest;
import Kodlama.io.Devs.business.responses.GetAllPLanguagesResponse;
import Kodlama.io.Devs.business.responses.GetPLanguageByIdResponse;
import Kodlama.io.Devs.entities.concretes.PLanguage;

public interface PLanguageService {
	List<GetAllPLanguagesResponse> getAll();
	GetPLanguageByIdResponse getById(int id) throws Exception;
	void add(CreatePLanguageRequest createPLanguageRequest) throws Exception;
	void update(UpdatePlanguageRequest updatePlanguageRequest, int id) throws Exception;
	void deleteById(int id);
}
