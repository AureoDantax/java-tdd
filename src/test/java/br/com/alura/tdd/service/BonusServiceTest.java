package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {


    /* A implementação abaixo faz dois testes, tanto o teste de lançamento da exception, quanto o Equals da
    mensagem de erro, e você pode conferir se o erro é o esperado

    outra maneira de implementar o teste é a seguinte, na linha que lança o erro adicione o assertThrows dessa forma:
    assertThrows(  Execption.clas, service.calcularBonus(new Funcionario("Aureo", LocalDate.now(), new BigDecimal("20000")));
     *no caso a exception que for implementada no método que ta sendo testado*.
     */
    @Test
    void BonusZero() {
        BonusService service = new BonusService();

        try {
            service.calcularBonus(
                    new Funcionario("Aureo", LocalDate.now(), new BigDecimal("20000")));
            fail(" não deu exceção");
        } catch (Exception e) {
            assertEquals("O salário atual não permite recebimento de bônus", e.getMessage());
        }


    }


    @Test
    void BonusDentroDoLimite() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Aureo", LocalDate.now(), new BigDecimal("2000")));
        assertEquals(new BigDecimal("200.00"), bonus);
    }


    @Test
    void BonusLimite() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Aureo", LocalDate.now(), new BigDecimal("10000")));
        assertEquals(new BigDecimal("1000.00"), bonus);
    }
}











