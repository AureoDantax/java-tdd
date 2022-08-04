package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class Reajuste {

    public void calculaReajuste(Funcionario funcionario, Desempenho desempenho ){
        if (desempenho == Desempenho.A_DESEJAR){
                BigDecimal reajusteAdesejar= funcionario.getSalario().multiply(new BigDecimal("0.03"));
             funcionario.setReajuste(reajusteAdesejar);

        }else if(desempenho == Desempenho.BOM){
            BigDecimal reajusteAdesejar= funcionario.getSalario().multiply(new BigDecimal("0.15"));
            funcionario.setReajuste(reajusteAdesejar);

        } else if (desempenho == Desempenho.OTIMO) {
            BigDecimal reajusteAdesejar= funcionario.getSalario().multiply(new BigDecimal("0.20"));
            funcionario.setReajuste(reajusteAdesejar);
        }

        }
    }
