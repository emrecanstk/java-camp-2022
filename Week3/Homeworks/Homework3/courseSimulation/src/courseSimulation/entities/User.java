package courseSimulation.entities;

public class User implements IBase {
	private String name;
	private String email;
	private int age;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void logIn(User user) {
		System.out.println(user.name + " siteye giriş yaptı.");

	}

	@Override
	public void logOut(User user) {
		System.out.println(user.name + " siteden çıkış yaptı.");

	}

}
