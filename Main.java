package fabrica;

import muncitori.Client;
import muncitori.Manager;
import muncitori.Muncitor;

public class Main {
	public static void main(String[] args) {
		Fabrica fabrica = new Fabrica();

		Muncitor muncitor1 = new Muncitor("Ionescu", "Maria", 5);
		muncitor1.afisareNumeFunctie("Muncitor");
		muncitor1.afisareSalariu(1500);
		muncitor1.adaugaResponsabilitate("Asamblare");
		muncitor1.adaugaResponsabilitate("Verificare");

		Manager manager1 = new Manager("Popa", "Mihai", 8);
		manager1.afisareNumeFunctie("Manager");
		manager1.afisareSalariu(2000);
		manager1.adaugaMuncitor(muncitor1);
		fabrica.adaugaAngajat(muncitor1);
		fabrica.adaugaAngajat(manager1);

		Client client1 = new Client("Smith");
		fabrica.adaugaClient(client1);
		fabrica.afisareClienti();

		fabrica.generareContract(client1, 5000);
		fabrica.eliberareFluturasSalar(muncitor1, 1000);
		fabrica.eliberareFluturasSalar(manager1, 2000);

		fabrica.afisareActeEmise();
	}
}