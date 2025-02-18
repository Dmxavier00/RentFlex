package rent.flex.system.domain.carro;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "carros")
@Entity(name = "Carro")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Carro {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modelo;
    private String placa;
    private Integer capacidade;
    private Double precoDiario;
    private StatusCarro status;




}
