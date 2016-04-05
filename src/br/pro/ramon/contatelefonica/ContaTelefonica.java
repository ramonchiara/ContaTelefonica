package br.pro.ramon.contatelefonica;

public class ContaTelefonica {

    private double minLocais;
    private double minDdd;
    private double minDdi;

    public ContaTelefonica(double minLocais, double minDdd, double minDdi) {
        this.minLocais = minLocais;
        this.minDdd = minDdd;
        this.minDdi = minDdi;
    }

    public double getAssinatura() {
        return 23.32;
    }

    public double getValorLocais() {
        return 0.09 * minLocais;
    }

    public double getValorDdd() {
        return 0.26 * minDdd;
    }

    public double getValorDdi() {
        return 0.86 * minDdi;
    }

    public double getValorTotal() {
        return getAssinatura() + getValorLocais() + getValorDdd() + getValorDdi();
    }

}
