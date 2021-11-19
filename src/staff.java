package com.personne;

public class staff extends people implements Admin {
    private String poste;
    private int salaire;
    private int anciennete;

    public  staff(String nom, int age, String poste, int salaire, int anciennete){
        super(nom,age);
        this.poste=poste;
        this.salaire=salaire;
        this.anciennete=anciennete;
    }

    public String getPoste() {
        return this.poste;
    }
    public void setPoste(String poste){
        this.poste=poste;
    }
    public int getSalaire(){
        return this.salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
    public int getAnciennete(){
        return this.salaire;
    }
    public void setAnciennete(int anciennete){
        this.anciennete=anciennete;
    }

    @Override
    public void afficherNotecoef() {

    }

    @Override
    public void direFiliere() {

    }

    public void displayPoste(){
        System.out.println("J'occupe le poste de: " + this.poste);
    }
    public void addSalaire() {
        if (anciennete >= 5) {
            System.out.println("Mon nouveau salaire est de: " + this.salaire * 1.3);
        } else {
            System.out.println("Mon nouveau salaire est de: " + this.salaire);
        }
    }

    public void showAnciennete(){
        System.out.println("J'ai " + this.anciennete + " ans d'anciennete");
    }


}
