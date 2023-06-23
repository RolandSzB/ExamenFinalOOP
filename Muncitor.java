package muncitori;

import java.util.ArrayList;


public class Muncitor extends Angajat {
    private ArrayList<String> responsabilitati;

    public Muncitor(String nume, String prenume, int aniVechime) {
        super(nume, prenume, aniVechime);
        responsabilitati = new ArrayList<>();
    }

    public void adaugaResponsabilitate(String responsabilitate) {
        responsabilitati.add(responsabilitate);
    }
}
