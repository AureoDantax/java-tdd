package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class Reajuste {

    /*o código abaixo possuia muios ifs encadeados, ao adicionar os métodos no enum Desempenho, ele só receberá a
    constante e realizara o calculo, mais eles não se conhecerão, design pattern strategy aplicado aqui
     */
    public void calculaReajuste(Funcionario funcionario, Desempenho desempenho) {

        BigDecimal percentual = desempenho.percentualReajuste();
        BigDecimal reajuste = funcionario.getSalario().multiply(percentual);
        funcionario.setReajuste(reajuste);
    }
}
