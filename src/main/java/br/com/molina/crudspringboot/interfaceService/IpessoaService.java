package br.com.molina.crudspringboot.interfaceService;

import br.com.molina.crudspringboot.modelo.Pessoa;

import java.util.List;
import java.util.Optional;

public interface IpessoaService {
    public List<Pessoa> listar();
    public Optional<Pessoa> listarId(int id);
    public int save(Pessoa p);
    public void delete (int id);


}
