package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void BonusZero() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Aureo", LocalDate.now(), new BigDecimal("20000") ));
        assertEquals(new BigDecimal("0.00"),bonus);
    }


    @Test
    void BonusDentroDoLimite() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Aureo", LocalDate.now(), new BigDecimal("2000") ));
        assertEquals(new BigDecimal("200.00"),bonus);
    }


    @Test
    void BonusLimite() {
            BonusService service = new BonusService();
            BigDecimal bonus = service.calcularBonus(new Funcionario("Aureo", LocalDate.now(), new BigDecimal("10000") ));
            assertEquals(new BigDecimal("1000.00"),bonus);
            }
    }











