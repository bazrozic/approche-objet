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

    public void displayInUpperCase(){
        System.out.println("nom : " + nom.toUpperCase() + " prenom : " + prenom.toUpperCase());
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public AdressePostale getAdressePostale() {
        return adressePostale;
    }

    public void setAdressePostale(AdressePostale adressePostale) {
        this.adressePostale = adressePostale;
    }
}