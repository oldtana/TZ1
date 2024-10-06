package org.example;

public class Turma {
    private String name;
    private String fullName;
    private String ls;
    private String inn;
    private String kpp;

    public String getLs() {
        return ls;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    public String getInn() {
        return inn;
    }

    public String getKpp() {
        return kpp;
    }
    public Turma(String name,String fullName,String ls,String inn,String kpp){
        this.fullName=fullName;
        this.ls=ls;
        this.inn=inn;
        this.kpp=kpp;
        this.name=name;
    }

}
