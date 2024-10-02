package com.example.RattapageProg2;

public class Immeuble {
    private int id;
    private String type;

    public Immeuble(int id, String type) {
        this.id = id;
        this.type = type;
    }
    // Getters et Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Immeuble{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
    
    public double calculerPrix() {
        if (type.equalsIgnoreCase("maison")) {
            return 100000;
        } else if (type.equalsIgnoreCase("appartement")) {
            return 50000;
        } else if (type.equalsIgnoreCase("terrain")) {
            return 20000;
        } else {
            return 0;
        }

    }


    public int compterAppartements() {
        return 0;
    }

    public String getAppartements() {
        return "Pas d'appartements dans cet immeuble";
    }
}
