package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    
    public int codice;
    public String nome;
    public String descrizione;
    public double prezzo;
    public double iva;

    public Prodotto(String nome, String descrizione, double prezzo, double iva) {

        Random randomGenerator = new Random();
        codice = randomGenerator.nextInt(1000);

        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public String getPrezzoBase() {
        return "Prezzo base: " + String.format("%.2f", prezzo) + "$";
    }

    public String getPrezzoConIva() {
        double prezzoConIva = prezzo + (prezzo * iva) / 100; 
        String prezzoConIvaStr = String.format("%.2f", prezzoConIva);
        String prezzoConIvaMessage = "Prezzo con IVA: " + prezzoConIvaStr + "$";
        return prezzoConIvaMessage;
    }

    public String getNomeEsteso() {
        String nomeEsteso = "Nome esteso: " + Integer.toString(codice) + "-" + nome;
        return nomeEsteso;
    }
}