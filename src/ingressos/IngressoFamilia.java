package ingressos;

public class IngressoFamilia extends Ingresso {
    private int numeroPessoas;

    public IngressoFamilia(double valor, String nomeFilme, boolean dublado, int numeroPessoas) {
        super(valor, nomeFilme, dublado);
        this.numeroPessoas = numeroPessoas;
    }

    @Override
    public double getValorReal() {
        double total = valor * numeroPessoas;
        if (numeroPessoas > 3) {
            total *= 0.95;
        }
        return total;
    }
}
