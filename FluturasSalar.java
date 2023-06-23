package promovare;

import muncitori.Angajat;

public class FluturasSalar  extends Act {
    private double valoareSalariu;
    private Angajat angajat;

    public FluturasSalar(double valoareSalariu, Angajat angajat) {
        this.valoareSalariu = valoareSalariu;
        this.angajat = angajat;
    }

	public double getValoareSalariu() {
		return valoareSalariu;
	}

	public Angajat getAngajat() {
		return angajat;
	}

	
}