package com.example.primeiroteste;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class MockitoTests {

    @Mock
    List<String> lista;

    @Test
    void meuPrimeiroMock() {
        Mockito.when(lista.size()).thenReturn(20);
        int size = lista.size();
        Assertions.assertThat(size).isEqualTo(20);
    }
}
