
package projeto.lpweb.etapa3.domain.service;

import projeto.lpweb.etapa3.domain.model.Jogador;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.lpweb.etapa3.domain.repository.JogadorRepositorio;

/**
 *
 * @author danie
 * Classe onde ficam as regras de negocio
 */
@Service
public class JogadorService {
    
    private final JogadorRepositorio jogadorRepositorio;
    
    @Autowired
    public JogadorService(JogadorRepositorio jogadorRepositorio) {
        this.jogadorRepositorio = jogadorRepositorio;
    }
    
    public List<Jogador> listarTodos(){
        return jogadorRepositorio.findAll();
    }
    
    public Optional<Jogador> pesquisarPor(Integer id){
        return jogadorRepositorio.findById(id);
    }
    
    public List<Jogador> pesquisarPor(String nome){
        return jogadorRepositorio.findByNome(nome);
    }
    
    @Transactional
    public void deletarPor(Integer id){
        jogadorRepositorio.deleteById(id);
    }
    
    @Transactional
    public Jogador salvarJogador(Jogador jogador){
        return jogadorRepositorio.save(jogador);
    }
    
}
