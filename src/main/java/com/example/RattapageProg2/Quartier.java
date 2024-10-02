package com.example.RattapageProg2;



import java.util.ArrayList;
import java.util.List;

public class Quartier extends Endroit {
    private List<Immeuble> immeubles;

    public Quartier(String identifiant, String nom) {
        super(Integer.parseInt(identifiant), nom);
        this.immeubles = new ArrayList<>();
    }


    public void ajouterImmeuble(Immeuble immeuble) {
        immeubles.add(immeuble);
    }


    @Override
    public int compterAppartements() {
        int total = 0;
        for (Immeuble immeuble : immeubles) {
            total += immeuble.compterAppartements();
        }
        return total;
    }


    public boolean contientAppartement(Appartement appartement) {
        for (Immeuble immeuble : immeubles) {
            if (immeuble.getAppartements().contains((CharSequence) appartement)) {
                return true;
            }
        }
        return false;
    }

    public List<Immeuble> getImmeubles() {
        return immeubles;
    }
}

