package Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import Kodlama.io.Devs.business.responses.GetAllLanguagesResponse;
import Kodlama.io.Devs.business.responses.GetLanguageByIdResponse;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {
	
	private LanguageService languageService;
	
	@Autowired
	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/getAll")
	public List<GetAllLanguagesResponse> getAll() {
		return languageService.getAll();
	}
	
	@GetMapping("/getById/{id}")
	public GetLanguageByIdResponse getById(int id) throws Exception {
		return languageService.getById(id);
	}
	
	@PostMapping("/add")
	public void add(CreateLanguageRequest language) throws Exception {
		languageService.add(language);
	}
	
	@PutMapping("/update/{id}")
	public void update(UpdateLanguageRequest updateLanguageRequest, int id) throws Exception {
		languageService.update(updateLanguageRequest, id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(int id) {
		languageService.deleteById(id);
	}
	
}
