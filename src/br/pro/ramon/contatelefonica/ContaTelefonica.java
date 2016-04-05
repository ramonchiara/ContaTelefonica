package br.pro.ramon.contatelefonica;

public class ContaTelefonica {

    private static final double ASSINATURA = 23.32;
    private static final double VALOR_MIN_LOCAL = 0.09;
    private static final double VALOR_MIN_DDD = 0.26;
    private static final double VALOR_MIN_DDI = 0.86;

    private double minLocais;
    private double minDdd;
    private double minDdi;

    public ContaTelefonica(double minLocais, double minDdd, double minDdi) {
        this.minLocais = minLocais;
        this.minDdd = minDdd;
        this.minDdi = minDdi;
    }

    public double getAssinatura() {
        return ASSINATURA;
    }

    public double getValorLocais() {
        return VALOR_MIN_LOCAL * minLocais;
    }

    public double getValorDdd() {
        return VALOR_MIN_DDD * minDdd;
    }

    public double getValorDdi() {
        return VALOR_MIN_DDI * minDdi;
    }

    public double getValorTotal() {
        return getAssinatura() + getValorLocais() + getValorDdd() + getValorDdi();
    }

}
