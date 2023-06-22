package com.example.nabung.models;

public class Transaction {
    public String DateTransaction;
    public String NameTransaction;
    public String NominalTransaction;

    public Transaction(){}

    public String getDateTransaction() {
        return DateTransaction;
    }

    public String getNameTransaction() {
        return NameTransaction;
    }

    public String getNominalTransaction() {
        return NominalTransaction;
    }

    public void setDateTransaction(String dateTransaction) {
        DateTransaction = dateTransaction;
    }

    public void setNameTransaction(String nameTransaction) {
        NameTransaction = nameTransaction;
    }

    public void setNominalTransaction(String nominalTransaction) {
        NominalTransaction = nominalTransaction;
    }
}



