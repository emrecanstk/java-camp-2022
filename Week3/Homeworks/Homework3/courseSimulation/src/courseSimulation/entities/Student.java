package courseSimulation.entities;

public class Student extends User implements ICanConsume {
	private String gitHubAdress;
	
	public Student() {
		this.setPosition("Öğrenci");
	}
	
	@Override
	public void takeCourse(Course course) {
		System.out.println(this.getName()+ " öğrencisi "+course.getName()+" kursunu aldı.");
		
	}

	public String getGitHubAdress() {
		return gitHubAdress;
	}

	public void setGitHubAdress(String gitHubAdress) {
		this.gitHubAdress = gitHubAdress;
	}
	
}
