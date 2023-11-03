package org.example;

public class TipoConteudoAdequado implements TipoConteudo {
    private static TipoConteudoAdequado tipoConteudoAdequado = new TipoConteudoAdequado();

    private TipoConteudoAdequado() {};

    public static TipoConteudoAdequado getTipoConteudoAdequado() {
        return tipoConteudoAdequado;
    }
}
