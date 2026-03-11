package org.gouv.finances.surf.demo.service;

import org.gouv.finances.surf.demo.entite.Commune;
import org.gouv.finances.surf.demo.entite.Departement;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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

    @Override
    public List<Commune> getCommunes() {
        return List.of(
                new Commune("75015", "Paris Vaugirard 15e arrondissement"),
                new Commune("75016", "Paris Passy 16e arrondissement"),
                new Commune("75017", "Paris Batignolles-Monceaux 17e arrondissement"),
                new Commune("75018", "Paris Butte-Montmartre 18e arrondissement"),
                new Commune("75019", "Paris Buttes-Chaumont 19e arrondissement"),
                new Commune("75009", "Paris Opéra 9e arrondissement"),
                new Commune("75006", "Paris Luxembourg 6e arrondissement")
        );
    }
}
