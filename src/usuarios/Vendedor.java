package usuarios;

public class Vendedor extends Usuario {
    private int quantidadeVendas;

    public Vendedor(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = false;
    }

    public void realizarVenda() {
        quantidadeVendas++;
    }

    public void consultarVendas() {}

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }
}
