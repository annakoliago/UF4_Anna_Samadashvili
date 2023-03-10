package Act1.InstitutBasic;

public class UsaInstitut {

	public static void main(String[] args) {

		Institut jh = new Institut("jau");
		Institut jh1 = new Institut("jau", 900);

		Alumne Marta = new Alumne("Marta", 19, "55611055E", "mperez@institutjaumehuguet.cat");
		Alumne Isaac = new Alumne("Isaac", 12, "55691255X", "icabre@institutjaumehuguet.cat");
		Alumne Raul = new Alumne("Raul", 18, "50981055D", "rperez@institutjaumehuguet.cat");

		Alumne Pau = new Alumne("Pau", 21, "98181055R", "pguerrera@institutjaumehuguet.cat");
		Alumne Jon = new Alumne("Jon", 18, "50900055P", "jpee@institutjaumehuguet.cat");
		Alumne Ricard = new Alumne("Ricard", 18, "50988885K", "rpalau@institutjaumehuguet.cat");

		jh.afegirAlumne(Marta);
		jh.afegirAlumne(Isaac);
		jh.afegirAlumne(Raul);

		jh1.afegirAlumne(Pau);
		jh1.afegirAlumne(Jon);
		jh1.afegirAlumne(Ricard);

		for (int i = 0; i < 3; i++) {
			System.out.println(jh.getLlistaAlumnes()[i].getName());
		}
		

		for (int i = 0; i < 3; i++) {
			System.out.println(jh1.getLlistaAlumnes()[i].getName());
		}

	}
}
