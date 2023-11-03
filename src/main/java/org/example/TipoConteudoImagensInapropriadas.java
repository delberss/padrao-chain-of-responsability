package org.example;

public class TipoConteudoImagensInapropriadas implements TipoConteudo {

    private static TipoConteudoImagensInapropriadas tipoConteudoImagensInapropriadas = new TipoConteudoImagensInapropriadas();

    private TipoConteudoImagensInapropriadas() {};

    public static TipoConteudoImagensInapropriadas getTipoConteudoImagensInapropriadas() {
        return tipoConteudoImagensInapropriadas;
    }
}