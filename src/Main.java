import ingressos.*;
import usuarios.*;
import relogios.*;

public class Main {
    public static void main(String[] args) {
        Ingresso meia = new MeiaEntrada(40.0, "Matrix", true);
        System.out.println("Valor Meia Entrada: R$" + meia.getValorReal());

        IngressoFamilia familia = new IngressoFamilia(30.0, "Shrek", false, 4);
        System.out.println("Valor Ingresso Família: R$" + familia.getValorReal());

        Gerente g = new Gerente("Ana", "ana@empresa.com", "123");
        Vendedor v = new Vendedor("João", "joao@empresa.com", "456");
        Atendente a = new Atendente("Carla", "carla@empresa.com", "789");

        v.realizarVenda();
        a.receberPagamento(100);
        System.out.println("Vendas do Vendedor: " + v.getQuantidadeVendas());
        System.out.println("Valor em caixa do Atendente: R$" + a.getValorEmCaixa());

        RelogioBrasileiro br = new RelogioBrasileiro();
        br.setHora(16); br.setMinuto(45); br.setSegundo(10);
        System.out.println("Horário BR: " + br.getHoraFormatada());

        RelogioAmericano us = new RelogioAmericano();
        us.sincronizarRelogio(br);
        System.out.println("Horário US: " + us.getHoraFormatada());
    }
}
