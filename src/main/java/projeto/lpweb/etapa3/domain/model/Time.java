
package projeto.lpweb.etapa3.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 *
 * @author danie
 */
@Entity
@Builder
@Getter @Setter @RequiredArgsConstructor
public class Time {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private List<Jogador> jogadores;
    private Estadio estadio;
    private List<Campeonato> campeonatos;
}
