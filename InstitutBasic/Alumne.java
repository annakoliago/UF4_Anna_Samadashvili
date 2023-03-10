package Act1.InstitutBasic;

public class Alumne {

	private String name;
	private int edat;
	private String DNI;
	private String email;

	public Alumne(String name, int edat, String DNI, String email) {
		this.name = name;
		this.edat = edat;
		this.DNI = DNI;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
