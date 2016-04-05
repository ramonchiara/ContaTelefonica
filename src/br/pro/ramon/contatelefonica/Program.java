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

        // SAÍDA
        String mensagem = "Assinatura: " + conta.getAssinatura() + "\n"
                + "Valor em Ligações Locais: " + conta.getValorLocais() + "\n"
                + "Valor em Ligações DDD: " + conta.getValorDdd() + "\n"
                + "Valor em Ligações DDI: " + conta.getValorDdi() + "\n"
                + "Valor Total: " + conta.getValorTotal();
        JOptionPane.showMessageDialog(null, mensagem);
    }

}
