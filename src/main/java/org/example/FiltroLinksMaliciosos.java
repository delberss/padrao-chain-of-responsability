package org.example;

public class FiltroLinksMaliciosos extends Filtro {

    public FiltroLinksMaliciosos(Filtro superior) {
        listaConteudos.add(TipoConteudoLinksMaliciosos.getTipoConteudoLinksMaliciosos());
        setFiltroSuperior(superior);
    }

    public String getDescricaoFiltro() {
        return "Conteúdo contém links maliciosos";
    }
}