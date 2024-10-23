package org.krosmozclash.service.interfaces;

import org.esport.model.Equipe;

import java.util.List;
import java.util.Optional;

public interface EquipeService {
    Equipe creerEquipe(Equipe equipe);

    Equipe modifierEquipe(Equipe equipe);

    void supprimerEquipe(Long id);

    Optional<Equipe> obtenirEquipe(Long id);

    List<Equipe> obtenirToutesEquipes();

    void ajouterJoueur(Long equipeId, Long joueurId);

    void retirerJoueur(Long equipeId, Long joueurId);

    List<Equipe> obtenirEquipesParTournoi(Long tournoiId);
}