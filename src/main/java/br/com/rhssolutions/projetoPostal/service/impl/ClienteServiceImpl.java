package br.com.rhssolutions.projetoPostal.service.impl;

import br.com.rhssolutions.projetoPostal.model.Cliente;
import br.com.rhssolutions.projetoPostal.service.ClienteService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  Classe que implementa o serviço de cliente <b>Strategy</b> baseado no design pattern <b>Facade</b>.
 *
 *
 *
 * @author RHSsolutions
 */

@Service
public class ClienteServiceImpl implements ClienteService {
    @Override
    public void salvar(Cliente cliente) {

    }

    @Override
    public void atualizar(Long id, Cliente cliente) {

    }

    @Override
    public void deletar(Long id) {

    }

    @Override
    public Cliente buscarPorId(Long id) {
        return null;
    }

    @Override
    public List<Cliente> buscarTodos() {
        return null;
    }
}
