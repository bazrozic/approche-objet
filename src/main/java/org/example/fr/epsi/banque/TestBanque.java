package org.example.fr.epsi.banque;

import org.example.fr.epsi.banque.entites.Compte;

public class TestBanque {

    public static void main(String[] args) {
        Compte compte = new Compte(123456, 1000);
        System.out.println(compte);
    }
}
