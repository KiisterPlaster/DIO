// Imports

package com.dio.base;

import java.math.BigDecimal;

/**
 * 
 * Foi utilizado neste arquivo o BigDecimal para a definição de valores
 * E Throws para informações de mensagens de erro do java
 * 
 * @see BigDecimal
 * @since Release 0.0.1
 * @version 0.0.1
 * @author By KiisterPlaster
 */

public class Order {

    // Atributos

    private final String code;
    private final BigDecimal totalValue;
    
    /**
     * Construtor da Classe
     * 
     * @param code Código do pedido
     * @param totalValue Valor total do pedido
     * 
     */

    public Order(String code, BigDecimal totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }

        /**
         * Construtor do Método
         * 
         * Calcula as taxas de acordo com o valor total do pedido
         * Se o pedido for maior que R$100, uma taxa é cobrada
         * @return Valor total do pedido com as taxas
         * @throws RuntimeException ("O pedido não pode ter valor negativo");
         * 
         */

    public BigDecimal calculateFee()
    throws RuntimeException{
        if (this.totalValue.signum() < 0) {
            throw new RuntimeException("O pedido não pode ter valor negativo.");
        }
        if (this.totalValue.compareTo(new BigDecimal("100,00")) > 0) {
            return this.totalValue.multiply(new BigDecimal("0.99"));
        }
        return this.totalValue;
    }

    /**
    * Método Comum
    */

    @Override
    public String toString() {
        return "Order=("+"code='"+ code + "'" +")";
        }
}