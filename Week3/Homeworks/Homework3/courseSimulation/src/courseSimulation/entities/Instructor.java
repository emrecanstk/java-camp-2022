package courseSimulation.entities;

import courseSimulation.business.CourseManager;

public class Instructor extends User implements ICanProduce {
	private String website;
	
	@Override
	public void createCourse(CourseManager courseManager, Course course) {
		
		System.out.print("Kurs oluşturma isteği --> "+this.getName()+ " | "+course.getName()+" --> ");
		courseManager.save(course);
		
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

}
