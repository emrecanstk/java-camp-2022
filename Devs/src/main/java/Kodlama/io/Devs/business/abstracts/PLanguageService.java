package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.business.requests.CreatePLanguageRequest;
import Kodlama.io.Devs.business.requests.UpdatePLanguageRequest;
import Kodlama.io.Devs.business.responses.GetAllPLanguagesResponse;
import Kodlama.io.Devs.business.responses.GetPLanguageByIdResponse;

public interface PLanguageService {
	List<GetAllPLanguagesResponse> getAll();
	GetPLanguageByIdResponse getById(int id) throws Exception;
	void add(CreatePLanguageRequest createPLanguageRequest) throws Exception;
	void update(UpdatePLanguageRequest updatePLanguageRequest, int id) throws Exception;
	void deleteById(int id);
}
