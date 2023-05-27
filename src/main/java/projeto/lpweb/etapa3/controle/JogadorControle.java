
package projeto.lpweb.etapa3.controle;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import projeto.lpweb.etapa3.domain.model.Jogador;
import org.springframework.web.bind.annotation.*;
import projeto.lpweb.etapa3.domain.service.JogadorService;
import java.util.Optional;

/**
 *
 * @author danie
 */
@RestController
@RequestMapping("/jogadores")
public class JogadorControle {
    
    @Autowired
    private JogadorService service;// ações de crud
    
    
    @PostMapping("/cadastrar")
    public Jogador cadastro(@RequestBody Jogador j){
        return service.salvarJogador(j);
    }
    
    @GetMapping
    public List<Jogador> listarJogadores(){
        return service.listarTodos();
    }
    
    @GetMapping("selecionar-nome/{nome}")
    public List<Jogador> pesquisarPorNome(@PathVariable String nome){
        return service.pesquisarPor(nome);
    } 
    
    @GetMapping("selecionar-codigo/{codigo}")
    public Optional<Jogador> selecionarPorCodigo(@PathVariable Integer codigo){
        return service.pesquisarPor(codigo);
    }    
}