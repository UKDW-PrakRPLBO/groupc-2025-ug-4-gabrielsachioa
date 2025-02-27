package org.example;

public abstract class Colokan {

    private String merk;
    private double promisedBandwidth;
    private int harga;

    // Constructor
    public Colokan(int harga, double promisedBandwidth, String merk) {
        this.harga = harga;
        this.promisedBandwidth = promisedBandwidth;
        this.merk = merk;
    }

    // Getter & Setter
    public String getMerk() {
        return merk;
    }

    public void setMerek(String merek) {
        this.merk = merk;
    }

    public double getPromisedBandwidth() {
        return promisedBandwidth;
    }

    public void setPromisedBandwidth(double promisedBandwidth) {
        this.promisedBandwidth = promisedBandwidth;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    // abstract method
    public abstract double getRealBandwidth();

}
