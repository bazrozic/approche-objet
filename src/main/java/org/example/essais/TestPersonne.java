package org.example.essais;

import org.example.entites.AdressePostale;
import org.example.entites.Personne;

public class TestPersonne {
    public static void main(String[] args) {

        AdressePostale adresse = new AdressePostale( "70", "Rue des fleurs", 44000, "Nantes");
        AdressePostale adresse2 = new AdressePostale("3", "Avenue du roi", 56350, "Allaire");

        Personne personne1 = new Personne("Doe", "John");
        Personne personne2 = new Personne("Doe", "Jane");

        personne1.setAdressePostale(adresse);
        personne2.setAdressePostale(adresse2);

        personne1.displayInUpperCase();
        personne2.displayInUpperCase();
    }
}