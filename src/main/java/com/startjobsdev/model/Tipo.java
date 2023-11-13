package com.startjobsdev.model;


public enum Tipo {


    BACKEND("backend"),
    FRONTEND("frontend"),
    FULLSTACK("fullstack"),
    PO("product-owner"),
    BIGDATA("big-data");

    private String tipo;
    // Atributo referente a model

    private Tipo (String tipo) {
        this.tipo = tipo;
    }
}
