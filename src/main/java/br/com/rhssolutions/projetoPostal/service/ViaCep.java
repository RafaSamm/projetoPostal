package br.com.rhssolutions.projetoPostal.service;

import br.com.rhssolutions.projetoPostal.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Cliente HTTP , criado via <b>OpenFeign</b>, para o consumo da API do <b>ViaCep</b>
 * @see <a href="https://spring.io/projects/spring-cloud-openfeign">Spring Cloud OpenFeign</a>
 * @see <a href="https://viacep.com.br">ViaCep</a>
 *
 * @author RHSsolutions
 */

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCep {
    @RequestMapping(method = RequestMethod.GET, value ="/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep")
                          final String cep);

}
