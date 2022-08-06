package br.com.alura.tdd.modelo;

import java.math.BigDecimal;
/* implementando um método statico nas constantes, deixamos explicito o que está sendo feito e enxugamos o método que
recebe esse enum, pois ele não precisará conhecer e validar qual enum chegou para realizar o calculo
ele recebe o objeto e realiza o calculo e ponto final.
 */
public enum Desempenho {

    OTIMO {
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("0.2");
        }
    },

        BOM {
            @Override
            public BigDecimal percentualReajuste() {
                return new BigDecimal("0.15");
            }
        },
            A_DESEJAR {
                @Override
                public BigDecimal percentualReajuste () {
                    return new BigDecimal("0.03");
                }
            } ;


            public abstract BigDecimal percentualReajuste ();


        }

