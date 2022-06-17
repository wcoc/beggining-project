package br.com.test.controller;

public class PessoaService {

    public Pessoa salvar(Pessoa pessoa) {

        // salva no banco.
        System.out.println(pessoa.nome);

        return pessoa;
    }
}
