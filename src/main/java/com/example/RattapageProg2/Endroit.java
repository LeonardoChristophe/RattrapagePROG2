package com.example.RattapageProg2;

import java.util.Objects;

public abstract class Endroit {
    private int id;
    private String nom;
    public Endroit(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    @Override
    public String toString() {
        return "Endroit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Endroit)) return false;
        Endroit endroit = (Endroit) o;
        return id == endroit.id &&
                nom.equals(endroit.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom);
    }


    public abstract int compterAppartements();
}
