package Act1.InstitutBasic;

public class Institut {

	private String nom;
	private Alumne[] llistaAlumnes;
	private int numAlumne = 0;

	public void afegirAlumne(Alumne x) {

		this.llistaAlumnes[numAlumne] = x;
		this.numAlumne++;
	}

	public Institut(String nom) {

		this.nom = nom;
		this.llistaAlumnes = new Alumne[100];
		numAlumne = 0;

	}

	public Institut(String nom, int max) {

		this.nom = nom;
		this.llistaAlumnes = new Alumne[max];
		numAlumne = 0;

	}

	public String getNom(String name) {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Alumne[] getLlistaAlumnes() {
		return llistaAlumnes;
	}

	public  Alumne []llistaAlumnes() {
		return this.llistaAlumnes;
	}

	public int getNum(int num) {
		return num;
	}

	public void setNum(int num) {
		this.numAlumne = num;
	}

}
