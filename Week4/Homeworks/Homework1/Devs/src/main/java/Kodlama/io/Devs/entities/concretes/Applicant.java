package Kodlama.io.Devs.entities.concretes;

import java.util.List;

public class Applicant {
	private int id;
	private String firstName;
	private String lastName;
	private List<PLanguage> haveLanguages;
	
	public Applicant() {}
	
	public Applicant(int id, String firstName, String lastName, List<PLanguage> haveLanguages) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.haveLanguages = haveLanguages;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<PLanguage> getHaveLanguages() {
		return haveLanguages;
	}

	public void setHaveLanguages(List<PLanguage> haveLanguages) {
		this.haveLanguages = haveLanguages;
	}
	
	
}
