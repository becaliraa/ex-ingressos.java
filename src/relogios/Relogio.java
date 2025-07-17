package relogios;

public abstract class Relogio {
    protected int hora;
    protected int minuto;
    protected int segundo;

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) this.hora = hora;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) this.segundo = segundo;
    }

    public String getHoraFormatada() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public abstract void sincronizarRelogio(Relogio outro);
}
