package org.example;

public class Postagem {

    private TipoConteudo tipoConteudo;

    public Postagem(TipoConteudo tipoConteudo) {
        this.tipoConteudo = tipoConteudo;
    }

    public TipoConteudo getTipoConteudo() {
        return tipoConteudo;
    }

    public void setTipoConteudo(TipoConteudo tipoConteudo) {
        this.tipoConteudo = tipoConteudo;
    }

}