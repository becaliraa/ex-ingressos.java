package ingressos;

public abstract class Ingresso {
    protected double valor;
    protected String nomeFilme;
    protected boolean dublado;

    public Ingresso(double valor, String nomeFilme, boolean dublado) {
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.dublado = dublado;
    }

    public abstract double getValorReal();

    public String getNomeFilme() {
        return nomeFilme;
    }

    public boolean isDublado() {
        return dublado;
    }
}
