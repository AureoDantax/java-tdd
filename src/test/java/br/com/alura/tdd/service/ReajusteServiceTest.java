package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {

    @Test
    public void calculaReajusteMinimo(){
        Reajuste service = new Reajuste();
        Funcionario func = new Funcionario("func", LocalDate.now(),new BigDecimal("2500.00"));
        service.calculaReajuste(func, Desempenho.A_DESEJAR);

        assertEquals(new BigDecimal("2575.00"),func.getSalario());
    }

    @Test
    public void calculaReajusteBom(){
        Reajuste service = new Reajuste();
        Funcionario func = new Funcionario("func", LocalDate.now(),new BigDecimal("2500.00"));
        service.calculaReajuste(func, Desempenho.BOM);

        assertEquals(new BigDecimal("2875.00"),func.getSalario());
    }

    @Test
    public void calculaReajusteOtimo(){
        Reajuste service = new Reajuste();
        Funcionario func = new Funcionario("func", LocalDate.now(),new BigDecimal("2500.00"));
        service.calculaReajuste(func, Desempenho.OTIMO);

        assertEquals(new BigDecimal("3000.00"),func.getSalario());
    }
}
