package dev.java.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

// Indica que é um Controller
@RestController

//Resquest Mappig - serve para indicar ao spring  que tudo esta sendo mapeado
@RequestMapping("missoes")
public class MissoesController {

// GET - Mandar uma requisicap para mostrar as missoes
    @GetMapping("/listarMissoes")
    public String listarMissoes(){
        return "Missoes listadas com sucesso";
    }

   //Mandar uma requisicap para criar as missoes
   @PostMapping("/criar")
    public String criarMissao(){
        return "Missao criada com sucesso";
    }

   //Mandar uma requisicap para alterar as missoes
   @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missao alterada com sucesso";
    }
  //Mandar uma requisicap para deletar as missoes
  @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Missao deletada com sucesso";
    }




}
