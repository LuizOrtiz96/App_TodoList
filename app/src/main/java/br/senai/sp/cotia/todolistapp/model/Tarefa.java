package br.senai.sp.cotia.todolistapp.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import lombok.Data;

@Data
@Entity
public class Tarefa {
    @PrimaryKey(autoGenerate = true)
    private Long idTarefa;
    private String titulo;
    private String descricao;
    private long dataCriacao;
    private long dataPrevista;
    private long dataFinalizada;


}

