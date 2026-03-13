package dev.java.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }


    // Listar todos os Ninjas
    public List<NinjaModel> listarTodosOsNinjas(){
        return ninjaRepository.findAll();
    }

    // Criar Ninja
    public NinjaModel criarNinja(NinjaModel ninja){
        return ninjaRepository.save(ninja);
    }

    // Listar Ninjas Por ID
    public NinjaModel listarNinjaPorId(Long id){
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.orElse(null);
    }


    // Deletar Ninja - Tem que ser método VOID
    public void deletarNinjaPorId(Long id){
         ninjaRepository.deleteById(id);
    }


// Atualizar Ninja
    public NinjaModel atualizarNinja(Long id,NinjaModel ninjaAtualizado ){
        if(ninjaRepository.existsById(id)) {
            ninjaAtualizado.setId(id);
            return ninjaRepository.save(ninjaAtualizado);
        }
        return null;

    }




}
