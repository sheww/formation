package nsis.metier;

public class Person {
	private String nom;
	private String prenom;
	private String emails;
	private String phone;
	private City c;
	
	public City getC() {
		return c;
	}
	public void setC(City c) {
		this.c = c;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmails() {
		return emails;
	}
	public void setEmails(String emails) {
		this.emails = emails;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Person(String nom, String prenom, String emails, String phone, City c) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.emails = emails;
		this.phone = phone;
		this.c = c;
	}
	@Override
	public String toString() {
		return "Person [nom=" + nom + ", prenom=" + prenom
				+ ", emails=" + emails + ", phone=" + phone + "]";
	}
	
	
}
