package com.example.primeiroteste;

import java.util.ArrayList;
import java.util.List;

public class Pessoas extends RuntimeException{
    private List<Pessoas> pessoa;
    private String name;

    public Pessoas() {
        this.pessoa = new ArrayList<>();
    }

    public List<Pessoas> getPessoa() {
        return this.pessoa;
    }

    public void setPessoa(Pessoas pessoa) throws RuntimeException{
        if (pessoa.getName() == null) {
            throw new RuntimeException("Nome é obrigatório");
        }
        this.pessoa.add(pessoa);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void removePessoa(Pessoas pessoa) throws RuntimeException{
        if (this.pessoa.isEmpty()) {
            throw new RuntimeException("Pessoa não encontrada");
        }
        this.pessoa.remove(pessoa);
    }
}
