package promovare;

import muncitori.Client;

public class Oferta extends Act {
    private double valoareTotala;
    private Client client;

    public Oferta(double valoareTotala, Client client) {
        this.valoareTotala = valoareTotala;
        this.client = client;
    }

	public Client getClient() {
		return client;
	}

	public double getValoareTotala() {
		return valoareTotala;
	}

	@Override
	public String toString() {
		return " Nume client: "+ client + " ";
	}
    
}
