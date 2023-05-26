
package projeto.lpweb.etapa3.repositorio;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import projeto.lpweb.etapa3.modelo.Jogador;

/**
 *
 * @author danie
 */
@Repository
public interface JogadorRepositorio extends CrudRepository<Jogador, Integer>{
    @Override
    List<Jogador> findAll();
    Jogador findById(int id);
    List<Jogador> findByNome(String nome);
}
