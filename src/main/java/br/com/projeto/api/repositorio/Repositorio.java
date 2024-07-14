package br.com.projeto.api.repositorio;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import br.com.projeto.api.modelo.Cliente;

@Repository
public interface Repositorio extends CrudRepository<Cliente, Long> {

}
