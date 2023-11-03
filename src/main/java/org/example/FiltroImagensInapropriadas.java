package org.example;

public class FiltroImagensInapropriadas extends Filtro {

    public FiltroImagensInapropriadas(Filtro superior) {
        listaConteudos.add(TipoConteudoImagensInapropriadas.getTipoConteudoImagensInapropriadas());
        setFiltroSuperior(superior);
    }

    public String getDescricaoFiltro() {
        return "Conteúdo contém imagens inapropriadas";
    }
}