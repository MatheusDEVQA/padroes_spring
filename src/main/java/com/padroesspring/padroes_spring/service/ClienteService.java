package com.padroesspring.padroes_spring.service;

import com.padroesspring.padroes_spring.model.Cliente;

public class ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
