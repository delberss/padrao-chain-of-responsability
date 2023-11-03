package org.example;

public class FiltroPalavrasProibidas extends Filtro {

    public FiltroPalavrasProibidas(Filtro superior) {
        listaConteudos.add(TipoConteudoPalavrasProibidas.getTipoConteudoPalavrasProibidas());
        setFiltroSuperior(superior);
    }

    public String getDescricaoFiltro() {
        return "Conteúdo contém palavras proibidas";
    }
}
