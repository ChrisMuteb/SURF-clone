package org.gouv.finances.surf.demo.entite;

public class Departement extends CodeLibelle{

    public Departement() {
    }

    public Departement(String code, String libelle){
        super.code = code;
        super.libelle = libelle;
    }
}
