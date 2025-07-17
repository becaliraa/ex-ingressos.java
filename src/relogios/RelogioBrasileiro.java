package relogios;

public class RelogioBrasileiro extends Relogio {
    @Override
    public void sincronizarRelogio(Relogio outro) {
        this.hora = outro.hora;
        this.minuto = outro.minuto;
        this.segundo = outro.segundo;
    }
}
