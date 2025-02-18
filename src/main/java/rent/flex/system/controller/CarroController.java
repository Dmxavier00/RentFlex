package rent.flex.system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("carros")
public class CarroController {

    @GetMapping //pegar todos os dados
    public void getAll() {

    }
}
