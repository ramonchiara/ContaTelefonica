package br.pro.ramon.contatelefonica;

import javax.swing.JOptionPane;

public class Program {

    public static void main(String[] args) {
        // ENTRADAS
        double minLocais = Double.parseDouble(JOptionPane.showInputDialog(null, "Minutos Locais"));
        double minDdd = Double.parseDouble(JOptionPane.showInputDialog(null, "Minutos DDD"));
        double minDdi = Double.parseDouble(JOptionPane.showInputDialog(null, "Minutos DDI"));

        // PROCESSAMENTO
        ContaTelefonica conta = new ContaTelefonica(minLocais, minDdd, minDdi);
        double assinatura = conta.getAssinatura();
        double valorLocais = conta.getValorLocais();
        double valorDdd = conta.getValorDdd();
        double valorDdi = conta.getValorDdi();
        double valorTotal = conta.getValorTotal();

        // SAÍDA
        String mensagem = "Assinatura: " + assinatura + "\n"
                + "Valor em Ligações Locais: " + valorLocais + "\n"
                + "Valor em Ligações DDD: " + valorDdd + "\n"
                + "Valor em Ligações DDI: " + valorDdi + "\n"
                + "Valor Total: " + valorTotal;
        JOptionPane.showMessageDialog(null, mensagem);
    }

}
