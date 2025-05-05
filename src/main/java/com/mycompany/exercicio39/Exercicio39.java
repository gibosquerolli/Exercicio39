package com.mycompany.exercicio39;

import javax.swing.JOptionPane;

public class Exercicio39 {
    public static void main(String[] args) {
        int n1 = 0, n2 = 0, n= 0;
        
        try {
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite número para divisão"));
            n = n1 / n2;
            JOptionPane.showMessageDialog(null, "Resultado :" + n);
        } catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null, "Erro: Divisão por zero não é aceita");
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Erro: deve digitar um número inteiro válido");
        } finally {
            JOptionPane.showMessageDialog(null, "Fim da execução");
        }

    }
}
