package org.example;

public class VGA extends Colokan{

    public VGA(int harga, double promisedBandwidth, String merk) {
        super(harga, promisedBandwidth, merk);
    }

    @Override
    public double getRealBandwidth() {

        // hitung rasio
        double ratio = (double) super.getHarga() / 30_000;

        if (ratio < 1) {
            return (double) (ratio * super.getPromisedBandwidth());
        } else {
            return (double) (super.getPromisedBandwidth());
        }
    }

}
