package Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.TechnologyService;
import Kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import Kodlama.io.Devs.business.requests.UpdateTechnologyRequest;
import Kodlama.io.Devs.business.responses.GetAllTechnologiesResponse;
import Kodlama.io.Devs.business.responses.GetTechnologyByIdResponse;
import Kodlama.io.Devs.core.CheckService;
import Kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import Kodlama.io.Devs.entities.concretes.Technology;

@Service
public class TechnologyManager implements TechnologyService {
	
	private TechnologyRepository technologyRepository;
	private CheckService checkService;
	
	@Autowired
	public TechnologyManager(TechnologyRepository technologyRepository, CheckService checkService) {
		this.technologyRepository = technologyRepository;
		this.checkService = checkService;
	}
	
	@Override
	public List<GetAllTechnologiesResponse> getAll() {
		
		List<Technology> technologies = technologyRepository.findAll();
		List<GetAllTechnologiesResponse> technologiesResponse = new ArrayList<GetAllTechnologiesResponse>();
		
		for(Technology technology: technologies) {
			GetAllTechnologiesResponse responseItem = new GetAllTechnologiesResponse();
			responseItem.setId(technology.getId());
			responseItem.setName(technology.getName());
			technologiesResponse.add(responseItem);
		}
		
		return technologiesResponse;
	}

	@Override
	public GetTechnologyByIdResponse getById(int id) throws Exception {
		List<Technology> technologies = technologyRepository.findAll();
		GetTechnologyByIdResponse responseItem = null;
		
		for(Technology technology: technologies) {
			if(technology.getId() == id) {
				responseItem = new GetTechnologyByIdResponse();
				responseItem.setName(technology.getName());
				responseItem.setId(technology.getId());
			}
		}
		
		if(responseItem == null) throw new Exception("We could not find this id: "+id);
		
		return responseItem;
	}

	@Override
	public void add(CreateTechnologyRequest createTechnologyRequest) throws Exception {
		Technology technology = new Technology();
		technology.setName(createTechnologyRequest.getName());
		
		if(checkService.checkTechnologyName(technology.getName())) {
			this.technologyRepository.save(technology);
		} else {
			throw  new Exception("Check this name. The name can not be empty or already exist.");
		}
	}

	@Override
	public void update(UpdateTechnologyRequest updateTechnologyRequest, int id) throws Exception {
		
		Technology technology = technologyRepository.getReferenceById(id);
		
		if(checkService.checkTechnologyName(updateTechnologyRequest.getName())) {
			technology.setName(updateTechnologyRequest.getName());
			technologyRepository.save(technology);
		} else {
			throw  new Exception("Check this name. The name can not be empty or already exist.");
		}
		
	}

	@Override
	public void deleteById(int id) {
		boolean isExist = technologyRepository.existsById(id);
		
		if(isExist) technologyRepository.deleteById(id);
		
	}

}
