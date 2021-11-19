package com.personne;
public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("--------Presentation-------");
        Etudiant e=new Etudiant("Bola", 17, 197, "GBA", 17.5);
        e.sayHi();
        e.direFiliere();
        e.afficherNotecoef();

        System.out.println("--------------------------- ");
        System.out.println("");




        staff s=new staff("Jacques", 42, "Comptable", 150000, 5);
        s.sayHi();
        s.addSalaire();
        s.displayPoste();
        s.showAnciennete();




    }
}
