package org.example.entites;

public class Personne {

    private String nom;
    private String prenom;
    private AdressePostale adressePostale;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne(String nom, String prenom, AdressePostale adressePostale){
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = adressePostale;
    }

    public void display(){
        System.out.println("personne : " + nom + " " + prenom + " " + adressePostale.display());
    }
}
