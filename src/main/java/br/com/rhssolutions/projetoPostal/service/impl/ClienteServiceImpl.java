package br.com.rhssolutions.projetoPostal.service.impl;

import br.com.rhssolutions.projetoPostal.model.Cliente;
import br.com.rhssolutions.projetoPostal.model.Endereco;
import br.com.rhssolutions.projetoPostal.repository.ClienteRepository;
import br.com.rhssolutions.projetoPostal.repository.EnderecoRepository;
import br.com.rhssolutions.projetoPostal.service.ClienteService;
import br.com.rhssolutions.projetoPostal.service.ViaCep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Classe que implementa o serviço de cliente <b>Strategy</b>.
 *
 * @author RHSsolutions
 */

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCep viaCep;

    @Override
    public void salvar(Cliente cliente) {
        salvarClienteComCep(cliente);
    }


    private void salvarClienteComCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCep.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);


    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if (clienteBd.isPresent()) {
            salvarClienteComCep(cliente);
        } else {
            System.out.println("Cliente não encontrado");
        }

    }

    @Override
    public void deletar(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        if (cliente.isPresent()) {
            clienteRepository.delete(cliente.get());
        } else {
            System.out.println("Cliente não encontrado");
        }

    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public List<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }
}
