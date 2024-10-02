/*/*Programmation orientée objet (1h 30)
On souhaite modéliser une partie de l’application de la recherche d’appartements avec Java.
Soient les règles de gestion suivantes :
- Un appartement se compose d’un identifiant, d’un titre, d’une description, d’un loyer
mensuel, et d’un statut (soit libre, occupé, ou en cours de libération). Il est rattaché à
un endroit où il se trouve;
- Un endroit peut être soit un immeuble, soit un quartier. Dans les deux cas, un endroit
aura toujours un identifiant, et un nom ;
- Un immeuble est un endroit qui a en plus : un nombre d’étages, tandis qu’un quartier
est un endroit qui aura un ensemble d’immeubles ;
Exemples :
- nous avons un appartement à louer dans l’immeuble Jade de 5 étages, qui lui même se
trouve dans le quartier d’Ivandry
- nous avons un appartement à louer dans le quartier d’Analamahitsy.
Tâches à faire :
1. Créer une méthode qui détermine pour un quartier donné si un appartement fourni en
paramètre est présent dans ce quartier ou non.
2. Créer une méthode qui, pour un endroit donné (immeuble / quartier) compte combien
d’appartements il contient en tout ;
Selon les principes de l’orienté objet (l’encapsulation, l’abstraction, l'héritage, le
polymorphisme), implémentez les classes pour modéliser cette application et mettez les sur
un repo Git. */



package com.example.RattapageProg2;
import com.example.RattapageProg2.Immeuble;

public class Appartement {
    private int id;
    private String title;
    private String description;
    private double PrixMensuel;
    private Statut statut;
    private Endroit endroit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrixMensuel() {
        return PrixMensuel;
    }

    public void setPrixMensuel(double prixMensuel) {
        PrixMensuel = prixMensuel;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public Endroit getEndroit() {
        return endroit;
    }

    public void setEndroit(Endroit endroit) {
        this.endroit = endroit;
    }

    public Appartement(int id, String title, String description, double prixMensuel, Statut statut, Endroit endroit) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.PrixMensuel = prixMensuel;
        this.statut = statut;
        this.endroit = endroit;
    }

    @Override
    public String toString() {
        return "Appartement{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", PrixMensuel=" + PrixMensuel +
                ", statut=" + statut +
                ", endroit=" + endroit +
                '}';
    }


    

}

