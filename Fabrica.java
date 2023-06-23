package fabrica;

import java.util.ArrayList;

import exceptiile.ExceptionInactiv;
import muncitori.Angajat;
import muncitori.Client;
import promovare.Act;
import promovare.FluturasSalar;
import promovare.Oferta;

public class Fabrica {
	private ArrayList<Angajat> angajati;
	private ArrayList<Client> clienti;
	private ArrayList<Act> acte;

	public Fabrica() {
		angajati = new ArrayList<>();
		clienti = new ArrayList<>();
		acte = new ArrayList<>();
	}

	public void adaugaAngajat(Angajat angajat) {
		angajati.add(angajat);
	}

	public void concediazaAngajat(Angajat angajat) {
		angajati.remove(angajat);
	}



	public void adaugaClient(Client client) {
		clienti.add(client);
	}

	public void afisareClienti() {
		for (Client client : clienti) {
			System.out.println("Nume client: " + client);
		}
	}

	public void generareContract(Client client, double valoareOferta) {
		Oferta oferta = new Oferta(valoareOferta, client);
		acte.add(oferta);
	}

	public void eliberareFluturasSalar(Angajat angajat, double valoareSalariu) {
		try {
			if (angajati.contains(angajat)) {
				FluturasSalar fluturasSalar = new FluturasSalar(valoareSalariu, angajat);
				acte.add(fluturasSalar);
				throw new ExceptionInactiv( "Angajat Concediat", 100);
			}
		} catch (ExceptionInactiv e) {
			System.out.println(e);
		}
	}

	public void afisareActeEmise() {
		for (Act act : acte) {
			if (act instanceof Oferta) {
				Oferta oferta = (Oferta) act;
				System.out.println(" Oferta | ID: " + act.getId() + " " + oferta.toString());
			} else if (act instanceof FluturasSalar) {
				FluturasSalar fluturasSalar = (FluturasSalar) act;
				System.out.println(" Fluturas salar | ID: " + act.getId() + ", Salariu: "
						+ fluturasSalar.getValoareSalariu());
			}
		}
	}
}
