// Imports

package com.dio.base;
import java.math.BigDecimal;

/**
 * Foi Utilizado neste arquivo de Taxa, o padrão "if-else" para a definição de valores
 * 
 * @see BigDecimal
 * @since Release 0.0.1
 * @version 0.0.1
 * @author By KiisterPlaster
 */

public class Taxa {
    
    // Atributos

    private final double totalValue;

    /**
     * Construtor da Classe
     * 
     * @param totalValue Valor total do pedido
     */
    

    public Taxa(double totalValue) {
        this.totalValue = totalValue;
    }

    /**
     * Construtor do Método
     * 
     * Se o pedido for mair que R$100, uma taxa é cobrada
     * @return Valor total do pedido com a taxas
     */

    public double calculateFee() {
        if (this.totalValue > 100){
            return this.totalValue * 0.99;
            }
        else {
            return this.totalValue;
            } 
    }
}