
package projeto.lpweb.etapa3.controle;
import projeto.lpweb.etapa3.modelo.Jogador;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author danie
 */
@RestController
public class JogadorControle {
    
    @GetMapping("/")
    public String teste(){
        return "Olá Mundo!";
    }
    
    @GetMapping("teste/{nome}")
    public String teste(@PathVariable String nome){
        return "Olá " + "<b>" + nome.toUpperCase() + "</b>";
    }
    
    @PostMapping("/jogador")
    public Jogador jogador(@RequestBody Jogador j){
        return j;
    }
    
}
