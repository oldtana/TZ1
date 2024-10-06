package org.example;

public class FSSP {
    private String name;
    private String fullPurpose;
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
        return fullPurpose;
    }

    public String getInn() {
        return inn;
    }

    public String getKpp() {
        return kpp;
    }
    public FSSP(String name,String fullPurpose,String ls,String inn,String kpp){
        this.fullPurpose=fullPurpose;
        this.ls=ls;
        this.inn=inn;
        this.kpp=kpp;
        this.name=name;
    }

}
