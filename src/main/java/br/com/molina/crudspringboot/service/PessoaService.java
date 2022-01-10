package br.com.molina.crudspringboot.service;

import br.com.molina.crudspringboot.interfaceService.IpessoaService;
import br.com.molina.crudspringboot.interfaces.IPessoa;
import br.com.molina.crudspringboot.modelo.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService implements IpessoaService {

    @Autowired
    private IPessoa data;

    @Override
    public List<Pessoa> listar() {
        return(List<Pessoa>) data.findAll();
    }

    @Override
    public Optional<Pessoa> listarId(int id) {
        return data.findById(id);
    }

    @Override
    public int save(Pessoa p) {
        int res=0;
        Pessoa pessoa=data.save(p);
        if(!pessoa.equals(null)){
            res=1;
        }
        return res;
    }

    @Override
    public void delete(int id) {

    }
}
