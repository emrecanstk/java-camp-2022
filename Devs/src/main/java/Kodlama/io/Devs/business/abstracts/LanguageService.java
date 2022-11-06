package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import Kodlama.io.Devs.business.responses.GetAllLanguagesResponse;
import Kodlama.io.Devs.business.responses.GetLanguageByIdResponse;

public interface LanguageService {
	List<GetAllLanguagesResponse> getAll();
	GetLanguageByIdResponse getById(int id) throws Exception;
	void add(CreateLanguageRequest createLanguageRequest) throws Exception;
	void update(UpdateLanguageRequest updateLanguageRequest, int id) throws Exception;
	void deleteById(int id);
}
