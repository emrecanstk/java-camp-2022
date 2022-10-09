package courseSimulation.entities;

public class User implements IBase {
	private String name;
	private String email;
	private String position;

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

	@Override
	public void logIn(User user) {
		System.out.println(user.name + " siteye giriş yaptı.");

	}

	@Override
	public void logOut(User user) {
		System.out.println(user.name + " siteden çıkış yaptı.");

	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
