package relogios;

public class RelogioAmericano extends Relogio {
    @Override
    public String getHoraFormatada() {
        String periodo = (hora >= 12) ? "PM" : "AM";
        int hora12 = (hora == 0 || hora == 12) ? 12 : hora % 12;
        return String.format("%02d:%02d:%02d %s", hora12, minuto, segundo, periodo);
    }

    @Override
    public void sincronizarRelogio(Relogio outro) {
        this.hora = outro.hora;
        this.minuto = outro.minuto;
        this.segundo = outro.segundo;
    }
}
