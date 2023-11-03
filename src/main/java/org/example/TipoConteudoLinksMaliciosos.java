package org.example;

public class TipoConteudoLinksMaliciosos implements TipoConteudo {

    private static TipoConteudoLinksMaliciosos tipoConteudoLinksMaliciosos = new TipoConteudoLinksMaliciosos();

    private TipoConteudoLinksMaliciosos() {};

    public static TipoConteudoLinksMaliciosos getTipoConteudoLinksMaliciosos() {
        return tipoConteudoLinksMaliciosos;
    }
}