package org.gouv.finances.surf.demo.service;

import org.gouv.finances.surf.demo.entite.Commune;
import org.gouv.finances.surf.demo.entite.Departement;

import java.util.List;

public interface DemoService {
    List<Departement> getDepartements();
    List<Commune> getCommunes();
}
