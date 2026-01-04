package com.exercito.taf.enums;

public enum Conceito {
    I(0, "Insuficiente"),
    R(1, "Regular"),
    B(2, "Bom"),
    MB(3, "Muito Bom"),
    E(4, "Excelente"),
    SUFICIENTE(5, "Suficiente");

    private final int prioridade;
    private final String descricao;

    Conceito(int prioridade, String descricao) {
        this.prioridade = prioridade;
        this.descricao = descricao;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public String getDescricao() {
        return descricao;
    }
}