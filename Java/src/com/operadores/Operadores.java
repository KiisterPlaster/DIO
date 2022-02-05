// Imports

package com.operadores;

public class Operadores {

    public static void main(String[] args) {
        System.out.println("PrePos");
        
        prepos();

        System.out.println("Aritimético");
        
        aritimetico();

        System.out.println("Atribuição");
        
        atribuicao();

        System.out.println("Procedência");
        
        procedencia();
    }
        
    
        private static void prepos() {
            
            int k = 10;

            int i = ++k;
            int I = --k;
            int j = k--;
            int J = k++;

            System.out.println(i + k);
            System.out.println(I + k);
            System.out.println(J + k);
            System.out.println(j + k);
        }

        private static void aritimetico() {

            int a = 10;
            int b = 20;
            int c = 30;
            int d = 40;
            int e = 50;

            int r1 = a + b;
            int r2 = b - c;
            int r3 = d * e;
            int r4 = e / a;
            int r5 = a % e;

            System.out.println(r1);
            System.out.println(r2);
            System.out.println(r3);
            System.out.println(r4);
            System.out.println(r5);
        }

        private static void atribuicao() {

            int i = 3500;
            short s = 10;
            long l = 50000L;
            int I = 50;
            float f = 3.5F;
            double d = f;

            System.out.println(d + 0);

            i += 5;
            s -= 10;
            d /= 2.74;
            I *= 6;
            l %= 50;

            System.out.println(i + i);
            System.out.println(l + l);
            System.out.println(s + s);
            System.out.println(I + I);
            System.out.println(d + d);

        }

        private static void procedencia() {

            int i = 10;
            int j = 20;
            int k = 30;

            int a = i++ + --j * k;

            System.out.println(i++ + --j * k + a);
            System.out.println(i + i);
            
            int b = k / --i % 3 + 1;
            
            System.out.println(k / --i % 3 + 1 + b);
            System.out.println(i + i);

            int c = 2;

            c *= i += 5;

            System.out.println(c *= i += 5 + c);
        }
}