package com.example.primeiroteste;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
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
