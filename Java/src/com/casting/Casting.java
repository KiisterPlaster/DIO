// Imports

package com.casting;

/**
 * @author KiisterPlaster
 * @version 0.0.1
 */

public class Casting {


    public static void main(String[] args) {

        // Downcast houve perca de informação
        byte b1;
        short s1 = 1000;
        b1 = (byte) s1;

        // Upcast não houve perca de informação
        long l1;
        int i1 = 10;
        l1 = i1;
        
        // Downcast houve perca de informação
        int i2;
        long l2 = 1000000000000000000L;
        i2 = (int) l2;

        // Downcast não houve perca de informação
        int i3;
        long l3 = 100000L;
        i3 = (int) l3;

        // Upcast não houve perca de informação
        double d1;
        float f1 = 10.5f;
        d1 = f1;

        // Downcast houve perca de informação
        float f2;
        float f3;
        double d2 = 10000.58d;
        f2 = (float) d2;
        double d3 = 10000.58550000000000000000000000002522;
        f3 = (float) d3;

        // Upcast houve a perca de informação pois houve um truncamento(truncar)
        // Se deu quando pegamos um numero fracionario(real) e tranforma ele em inteiro
        int i4;
        float f4 = 11.5697f;
        i4 = (int) f4;

        System.out.println("b1: " + b1);
        System.out.println("l1: " + l1);
        System.out.println("i2: " + i2);
        System.out.println("i3: " + i3);
        System.out.println("d1: " + d1);
        System.out.println("f2: " + f2);
        System.out.println("f3: " + f3);
        System.out.println("i4: " + i4);

        // Downcast houve a perca de informação pois houve um truncamento(truncar)
        // Se deu quando pegamos um numero double e tranformamos ele em um byte
        b1 = (byte) d3;

        System.out.println("b1: " + b1);
    }    
}