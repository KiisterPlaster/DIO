// Imports

/**
 * @author KiisterPlaster
 * @version 0.0.1
 */

package com.calculadora;

import com.calculadora.Calculadora;
import com.calculadora.Emprestimo;
import com.calculadora.Relogio;

/**
 * Esta classe pegara todas as informações criadas nas demais classe
 * E irá utilizalas nessa aqui 
 */

public class Executavel {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício Calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        // Empréstimo
        System.out.println("Exercício Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 3);

        // Mensagem
        System.out.println("Exercício Mensagem");
        Relogio.obterMensagem(9);
        Relogio.obterMensagem(14);
        Relogio.obterMensagem(1);
    }
}