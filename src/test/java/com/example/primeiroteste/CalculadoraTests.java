package com.example.primeiroteste;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class CalculadoraTests {

    @Test
    public void sum() {
        // Cenario
        Calculadora calc = new Calculadora();

        // Execução
        int result = calc.sum(10, 10);

        // Teste
        Assertions.assertThat(result).isEqualTo(20);
    }

    @Test
    public void notSumWithNumberNull() {

    }

    @Test
    public void less() {
        //Cenario
        Calculadora calc = new Calculadora();

        // Execução
        int result = calc.less(10, 5);

        // Teste
        Assertions.assertThat(result).isEqualTo(5);
    }

    @Test
    public void division() {
        //Cenario
        Calculadora calc = new Calculadora();

        // Execução
        double result = calc.division(5, 5);

        // Teste
        Assertions.assertThat(result).isEqualTo(1);
    }

}
