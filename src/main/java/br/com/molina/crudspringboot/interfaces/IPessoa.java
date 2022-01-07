package br.com.molina.crudspringboot.interfaces;

import br.com.molina.crudspringboot.modelo.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPessoa extends CrudRepository<Pessoa, Integer> {
}
