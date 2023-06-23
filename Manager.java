package muncitori;

import java.util.ArrayList;


public class Manager extends Angajat {
    private ArrayList<Muncitor> subordonati;

    public Manager(String nume, String prenume, int aniVechime) {
        super(nume, prenume, aniVechime);
        subordonati = new ArrayList<>();
    }

    public void adaugaMuncitor(Muncitor muncitor) {
        subordonati.add(muncitor);
    }
}
