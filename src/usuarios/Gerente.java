package usuarios;

public class Gerente extends Usuario {

    public Gerente(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = true;
    }

    public void gerarRelatorioFinanceiro() {}
    public void consultarVendas() {}
}
