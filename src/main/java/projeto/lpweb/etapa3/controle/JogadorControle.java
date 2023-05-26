
package projeto.lpweb.etapa3.controle;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import projeto.lpweb.etapa3.modelo.Jogador;
import org.springframework.web.bind.annotation.*;
import projeto.lpweb.etapa3.repositorio.JogadorRepositorio;

/**
 *
 * @author danie
 */
@RestController
public class JogadorControle {
    
    @Autowired
    private JogadorRepositorio acao;// ações de crud
    
    @PostMapping("/cadastrar-jogador")
    public Jogador cadastro(@RequestBody Jogador j){
        return acao.save(j);
    }
    
    @GetMapping("/listar-jogadores")
    public List<Jogador> listarJogadores(){
        return acao.findAll();
    }
    
    @GetMapping("selecionar-nome/{nome}")
    public List<Jogador> selecionarPorNome(@PathVariable String nome){
        return acao.findByNome(nome);
    } 
    
    @GetMapping("selecionar-codigo/{codigo}")
    public Jogador selecionarPorCodigo(@PathVariable int codigo){
        return acao.findById(codigo);
    }    
}







//
//    @GetMapping("/")
//    public String teste(){
//        return "Olá Mundo!";
//    }
//    
//    @GetMapping("teste/{nome}")
//    public String teste(@PathVariable String nome){
//        return "Olá " + "<b>" + nome.toUpperCase() + "</b>";
//    }
//    
//    @PostMapping("/jogador")
//    public Jogador jogador(@RequestBody Jogador j){
//        return j;
//    }