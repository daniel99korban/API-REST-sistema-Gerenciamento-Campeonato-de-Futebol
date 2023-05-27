
package projeto.lpweb.etapa3.domain.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import projeto.lpweb.etapa3.domain.model.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author danie
 */
@Repository
public interface JogadorRepositorio extends JpaRepository<Jogador, Integer>{
    List<Jogador> findAll();
    Jogador findById(int id);
    List<Jogador> findByNome(String nome);
    void deleteById(Integer id);
    public Jogador save(Jogador jogador);
}
