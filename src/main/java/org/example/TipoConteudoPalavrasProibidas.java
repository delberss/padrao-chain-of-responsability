package org.example;

public class TipoConteudoPalavrasProibidas implements TipoConteudo {

    private static TipoConteudoPalavrasProibidas tipoConteudoPalavrasProibidas = new TipoConteudoPalavrasProibidas();

    private TipoConteudoPalavrasProibidas() {};

    public static TipoConteudoPalavrasProibidas getTipoConteudoPalavrasProibidas() {
        return tipoConteudoPalavrasProibidas;
    }
}