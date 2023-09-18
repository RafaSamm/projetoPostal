package br.com.rhssolutions.projetoPostal.service;

import br.com.rhssolutions.projetoPostal.model.Cliente;

import java.util.List;

/**
 * Interface definida no design pattern<b>Strategy</b> responsável por definir os métodos de negácio da entidade Cliente.
 *
 * @author RHSsolutions
 */

public interface ClienteService {

    void salvar(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

    Cliente buscarPorId(Long id);

    List<Cliente> buscarTodos();


}
