package usuarios;

public class Atendente extends Usuario {
    private double valorEmCaixa;

    public Atendente(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = false;
    }

    public void receberPagamento(double valor) {
        valorEmCaixa += valor;
    }

    public void fecharCaixa() {}

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }
}
