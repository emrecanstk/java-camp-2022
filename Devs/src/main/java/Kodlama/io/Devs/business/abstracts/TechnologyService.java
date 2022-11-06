package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import Kodlama.io.Devs.business.requests.UpdateTechnologyRequest;
import Kodlama.io.Devs.business.responses.GetAllTechnologiesResponse;
import Kodlama.io.Devs.business.responses.GetTechnologyByIdResponse;

public interface TechnologyService {
	List<GetAllTechnologiesResponse> getAll();
	GetTechnologyByIdResponse getById(int id) throws Exception;
	void add(CreateTechnologyRequest createTechnologyRequest) throws Exception;
	void update(UpdateTechnologyRequest updateTechnologyRequest, int id) throws Exception;
	void deleteById(int id);
}
