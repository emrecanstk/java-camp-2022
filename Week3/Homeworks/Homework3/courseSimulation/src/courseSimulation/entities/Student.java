package courseSimulation.entities;

public class Student extends User implements ICanConsume {
	private int numberOfCoursesTaken;
	private String gitHubAdress;

	@Override
	public void takeCourse(Course course) {
		System.out.println(this.getName()+ " öğrencisi "+course.getName()+" kursunu aldı.");
		
	}
}
