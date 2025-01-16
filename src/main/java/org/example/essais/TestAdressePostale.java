package org.example.essais;

import org.example.entites.AdressePostale;

public class TestAdressePostale {
    public static void main(String[] args){

        AdressePostale adresse1 = new AdressePostale( "70", "Rue des fleurs", 44000, "Nantes");
        AdressePostale adresse2 = new AdressePostale("3", "Avenue du roi", 56350, "Allaire");
        adresse1.display();
        adresse2.display();
    }
}
