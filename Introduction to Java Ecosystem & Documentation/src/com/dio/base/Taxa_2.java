// Imports

package com.dio.base;
import java.math.BigDecimal;

/**
 * Foi Utilizado neste arquivo de Taxa, o padrão "switch-case" para a definição de valores
 * 
 * @see BigDecimal
 * @since Release 0.0.1
 * @version 0.0.1
 * @author By KiisterPlaster
 */

public class Taxa_2 {
    
    // Atributos

    private final int totalValue;

    /**
     * Construtor da Classe
     * 
     * @param totalValue Valor total do pedido
     */

    public Taxa_2(int totalValue) {
        this.totalValue = totalValue;
    }

    /**
     * Construtor do Método
     * 
     * Se o pedido for mair que R$100, uma taxa é cobrada
     * @return Valor total do pedido com a taxas
     */

    public double calculateFee() {
        switch (this.totalValue) {
            case 100: return totalValue * 0.99;
            case 200: return totalValue * 1.99;
            case 300: return totalValue * 3.00;
            default: return totalValue;
            }
        }  
    
}