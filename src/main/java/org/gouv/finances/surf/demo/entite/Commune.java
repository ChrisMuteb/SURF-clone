package org.gouv.finances.surf.demo.entite;

public class Commune extends CodeLibelle{
    public Commune() {
    }
    public Commune(String code, String libelle){
        super.code = code;
        super.libelle = libelle;
    }
}
