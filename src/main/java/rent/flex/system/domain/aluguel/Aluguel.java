package rent.flex.system.domain.aluguel;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import rent.flex.system.domain.carro.Carro;
import rent.flex.system.domain.cliente.Cliente;

import java.time.LocalDate;

@Table(name = "alugueis")
@Entity(name = "Aluguel")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Aluguel {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double valorTotal;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Cliente cliente;
    private Carro carro;


}
