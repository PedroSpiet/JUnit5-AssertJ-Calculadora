package com.example.primeiroteste;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CadastroPessoasTests {
    @Test
    public void verificarListaDePessoas() {
        Pessoas pessoa = new Pessoas();

        List<Pessoas> verificar = pessoa.getPessoa();

        Assertions.assertThat(verificar).isEmpty();
    }

    @Test
    public void cadastrarPessoa() {
        Pessoas pessoa = new Pessoas();
        pessoa.setName("Pedro");
        pessoa.setPessoa(pessoa);

        Assertions.assertThat(pessoa.getPessoa())
                .isNotEmpty()
                .hasSize(1)
                .contains(pessoa);
    }

    @Test
    public void verificarNomeNulo() {
        Assertions.assertThatThrownBy(() -> {
           Pessoas pessoa = new Pessoas();
           pessoa.setPessoa(pessoa);
        }).isInstanceOf(RuntimeException.class).hasMessageContaining("Nome é obrigatório");
    }

    @Test
    public void removerPessoa() {
        Pessoas pessoa = new Pessoas();

        pessoa.setName("Pedro");
        pessoa.setPessoa(pessoa);

        pessoa.removePessoa(pessoa);

        Assertions.assertThat(pessoa.getPessoa()).isEmpty();
    }

    @Test
    public void naoDeletarPessoaInexistente() {
        Assertions.assertThatThrownBy(() -> {
            Pessoas pessoa = new Pessoas();
            pessoa.removePessoa(pessoa);
        }).hasMessageContaining("Pessoa não encontrada");
    }
}
