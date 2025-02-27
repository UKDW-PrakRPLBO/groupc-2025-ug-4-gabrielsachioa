package org.example;

public class HDMI extends Colokan{

    public HDMI(int harga, double promisedBandwidth, String merk) {
        super(harga, promisedBandwidth, merk);
    }

    @Override
    public double getRealBandwidth() {

        // hitung rasio
        double ratio = (double) super.getHarga() / 50_000;

        if(ratio < 1) {
            return (double) (ratio * super.getPromisedBandwidth());
        }
        else {
            return (double) (super.getPromisedBandwidth());
        }

    }

}
