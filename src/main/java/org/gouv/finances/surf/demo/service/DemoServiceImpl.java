package org.gouv.finances.surf.demo.service;

import org.gouv.finances.surf.demo.entite.Departement;

import java.util.List;

public class DemoServiceImpl implements DemoService{

    @Override
    public List<Departement> getDepartements() {

        return List.of(
                new Departement("075", "Paris"),
                new Departement("091", "Essonne"),
                new Departement("092", "Hauts-de-Seine"),
                new Departement("093", "Seine-Saint-Denis"),
                new Departement("094", "Val-de-Marne"),
                new Departement("095", "Val-d’Oise")
        );
    }
}
