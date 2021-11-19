package com.personne;


    public class Etudiant extends people implements Admin
    {
        private int id;
        private String filiere;
        private double note;

        public Etudiant( String nom, int age, int id, String filiere, double note){
            super(nom, age);
            this.id=id;
            this.filiere=filiere;
            this.note=note;
        }
        public int getId()
        {
            return this.id;
        }
        public void setId(int i){
            this.id=id;
        }
        public String getFiliere(){
            return this.filiere;
        }
        public void setFiliere(String filiere){
            this.filiere=filiere;
        }
        public double getNote(){
        return this.note;
    }
        public void setNote(double note){
            this.note=note;
        }
        public void afficherNotecoef(){
            System.out.println("Ma note coefficiee est de  : " + this.note*3);
        }
        public void direFiliere(){
            System.out.println("Je suis en  :  " + this.filiere);

        }

        @Override
        public void displayPoste() {

        }

        @Override
        public void addSalaire() {

        }

        @Override
        public void showAnciennete() {

        }

    }

