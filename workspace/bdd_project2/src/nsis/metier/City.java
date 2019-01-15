package nsis.metier;

public class City {
	private String name;
	private String mayor;
	private int inhabitants;
	private int postalcode;
	private int id;

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
	public String getMayor() {
		return mayor;
	}
	public void setMayor(String mayor) {
		this.mayor = mayor;
	}
	public int getInhabitants() {
		return inhabitants;
	}
	public void setInhabitants(int inhabitants) {
		this.inhabitants = inhabitants;
	}
	public int getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(int postalcode) {
		this.postalcode = postalcode;
	}
	public City( String name, String mayor, int inhabitants, int postalcode) {
		super();
		this.name = name;
		this.mayor = mayor;
		this.inhabitants = inhabitants;
		this.postalcode = postalcode;
	}
	@Override
	public String toString() {
		return "City [name=" + name + ", mayor=" + mayor + ", inhabitants=" + inhabitants
				+ ", postalcode=" + postalcode + "]";
	}
	
}
