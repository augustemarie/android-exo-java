package com.personne;

public abstract class people {
    private String nom;
    private  int age ;
    public people(String nom, int age){
        this.nom=nom;
        this.age=age;
    }
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public int getAge(){
        return this.age;
    }
    public  void setAge(int age){
        this.age=age;
    }
    public void sayHi()
    {
        System.out.println("Salut, je suis  " + nom +  " et j'ai "+ age + "ans");
    }

}
