package muncitori;

public abstract class Angajat {

	private String nume;
	private String prenume;
	private int aniVechime;

	public Angajat(String nume, String prenume, int aniVechime) {
		this.nume = nume;
		this.prenume = prenume;
		this.aniVechime = aniVechime;
	}

	public double calculSalariu(double valoareSalariu) {
		return valoareSalariu * aniVechime;
	}

	public void afisareSalariu(double valoareSalariu) {
		double salariu = calculSalariu(valoareSalariu);
		System.out.println(" Salariu: " + salariu);
	}

	public void afisareNumeFunctie(String functie) {
		System.out.print("Nume complet și funcție: " + nume + " " + prenume + " (" + functie + ")" );
	}
}
