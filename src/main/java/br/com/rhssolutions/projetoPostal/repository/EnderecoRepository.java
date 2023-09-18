package br.com.rhssolutions.projetoPostal.repository;

import br.com.rhssolutions.projetoPostal.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
