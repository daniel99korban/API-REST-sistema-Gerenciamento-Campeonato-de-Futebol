
package projeto.lpweb.etapa3.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Jogador {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String nascimento;
    private String genero;// enum(masc, fem, outro)
    private float altura;
}
