package Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.PLanguageService;
import Kodlama.io.Devs.business.requests.CreatePLanguageRequest;
import Kodlama.io.Devs.business.requests.UpdatePLanguageRequest;
import Kodlama.io.Devs.business.responses.GetAllPLanguagesResponse;
import Kodlama.io.Devs.business.responses.GetPLanguageByIdResponse;

@RestController
@RequestMapping("/api/languages")
public class PLanguageController {
	
	private PLanguageService languageService;
	
	@Autowired
	public PLanguageController(PLanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/getAll")
	public List<GetAllPLanguagesResponse> getAll() {
		return languageService.getAll();
	}
	
	@GetMapping("/getById/{id}")
	public GetPLanguageByIdResponse getById(int id) throws Exception {
		return languageService.getById(id);
	}
	
	@PostMapping("/add")
	public void add(CreatePLanguageRequest language) throws Exception {
		languageService.add(language);
	}
	
	@PutMapping("/update/{id}")
	public void update(UpdatePLanguageRequest updateLanguageRequest, int id) throws Exception {
		languageService.update(updateLanguageRequest, id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(int id) {
		languageService.deleteById(id);
	}
	
}
