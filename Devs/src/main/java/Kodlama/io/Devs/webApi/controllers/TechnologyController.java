package Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.TechnologyService;
import Kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import Kodlama.io.Devs.business.requests.UpdateTechnologyRequest;
import Kodlama.io.Devs.business.responses.GetAllTechnologiesResponse;
import Kodlama.io.Devs.business.responses.GetTechnologyByIdResponse;

@RestController
@RequestMapping("/api/technologies")
public class TechnologyController {
	
	private TechnologyService technologyService;
	
	@Autowired
	public TechnologyController(TechnologyService technologyService) {
		this.technologyService = technologyService;
	}
	
	@GetMapping("/getAll")
	public List<GetAllTechnologiesResponse> getAll() {
		return technologyService.getAll();
	}
	
	@GetMapping("/getById/{id}")
	public GetTechnologyByIdResponse getById(int id) throws Exception {
		return technologyService.getById(id);
	}
	
	@PostMapping("/add")
	public void add(CreateTechnologyRequest technology) throws Exception {
		technologyService.add(technology);
	}
	
	@PutMapping("/update/{id}")
	public void update(UpdateTechnologyRequest updateTechnologyRequest, int id) throws Exception {
		technologyService.update(updateTechnologyRequest, id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(int id) {
		technologyService.deleteById(id);
	}
	
	
}
