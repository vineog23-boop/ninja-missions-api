package dev.java.CadastroDeNinjas.Ninjas;

import dev.java.CadastroDeNinjas.Missoes.MissoesModel;
import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {

    // Converte NinjaModel → NinjaDTO
    public NinjaDTO toDTO(NinjaModel ninja) {
        if (ninja == null) return null;

        return new NinjaDTO(
                ninja.getId(),
                ninja.getNome(),
                ninja.getEmail(),
                ninja.getImgUrl(),
                ninja.getIdade(),
                ninja.getRank(),
                ninja.getMissoes() != null ? ninja.getMissoes().getId() : null
        );
    }

    // Converte NinjaDTO → NinjaModel
    public NinjaModel toModel(NinjaDTO dto) {
        if (dto == null) return null;

        NinjaModel ninja = new NinjaModel();
        ninja.setId(dto.getId());
        ninja.setNome(dto.getNome());
        ninja.setEmail(dto.getEmail());
        ninja.setImgUrl(dto.getImgUrl());
        ninja.setIdade(dto.getIdade());
        ninja.setRank(dto.getRank());

        if (dto.getMissaoId() != null) {
            MissoesModel missao = new MissoesModel();
            missao.setId(dto.getMissaoId());
            ninja.setMissoes(missao);
        }

        return ninja;
    }
}