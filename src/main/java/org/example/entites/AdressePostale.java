package org.example.entites;

public class AdressePostale {
    private String numeroDeRue;
    private String nomRue;
    private int codePostal;
    private String ville;

    public AdressePostale(String numeroDeRue, String nomRue, int codePostal, String ville) {
        this.numeroDeRue = numeroDeRue;
        this.nomRue = nomRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public String display(){
        System.out.println("adresse : " + numeroDeRue + nomRue + ville + codePostal);
        return ("adresse : " + numeroDeRue + nomRue + ville + codePostal);
    }
}
