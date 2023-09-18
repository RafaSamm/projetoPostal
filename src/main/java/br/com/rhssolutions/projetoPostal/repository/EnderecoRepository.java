package br.com.rhssolutions.projetoPostal.repository;

import br.com.rhssolutions.projetoPostal.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, String> {

}
