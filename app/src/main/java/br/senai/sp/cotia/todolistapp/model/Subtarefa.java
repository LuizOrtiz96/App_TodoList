package br.senai.sp.cotia.todolistapp.model;

import lombok.Data;

@Data
public class Subtarefa {
    private Long idSubtarefa;
    private String descricao;
    private String foto;
    private boolean concluida;
    private Long idTarefa;

}
