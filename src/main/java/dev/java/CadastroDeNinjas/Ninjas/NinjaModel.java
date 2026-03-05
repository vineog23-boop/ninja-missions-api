package dev.java.CadastroDeNinjas.Ninjas;

import dev.java.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name =  "tb_cadastro_personagens")
@Entity
//lombok e suas annotations
@NoArgsConstructor
@AllArgsConstructor
@Data

    public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String nome;

    // colum com uniuque = true ; é utilizado em dados sensiveis e únicos --> como email, cpf,passaporte
    @Column(unique = true)

    private String email;
    private int idade;

// Muitos ninjas so podem ter uma missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") // chave estrangeira
    private MissoesModel missoes; }

