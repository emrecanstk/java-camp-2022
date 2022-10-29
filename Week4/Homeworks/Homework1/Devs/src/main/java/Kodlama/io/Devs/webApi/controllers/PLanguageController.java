package Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.PLanguageService;
import Kodlama.io.Devs.entities.concretes.PLanguage;

@RestController
@RequestMapping("/api/emre")
public class PLanguageController {
	
	private PLanguageService languageService;
	
	@Autowired
	public PLanguageController(PLanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/getAll")
	public List<PLanguage> getAll() {
		return languageService.getAll();
	}
	
	@GetMapping("/getById")
	public PLanguage getById(int id) {
		return languageService.getById(id);
	}
	
	@GetMapping("/add")
	public void add(PLanguage language) throws Exception {
		languageService.add(language);
		System.out.println("Added "+language.getName());
	}
	
	@GetMapping("/update")
	public void update(PLanguage language) throws Exception {
		languageService.update(language);
		System.out.println("Updated "+language.getName());
	}
	
	@GetMapping("/delete")
	public void delete(int id) {
		languageService.delete(id);
		System.out.println("Deleted.");
	}
	
}
