package youtubeEgitim;

public class Customer {
	private int id;
	private String name;
	private String nationalIdentity;
	private String city;
	
	public Customer() {}
	
	public Customer(int id, String name, String nationalIdentity) {
		super();
		this.id = id;
		this.name = name;
		this.nationalIdentity = nationalIdentity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
