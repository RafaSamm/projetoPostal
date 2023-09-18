package br.com.rhssolutions.projetoPostal.repository;

import br.com.rhssolutions.projetoPostal.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
