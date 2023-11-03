package org.example;

import java.util.ArrayList;

public abstract class Filtro {

    protected ArrayList listaConteudos = new ArrayList();
    private Filtro filtroSuperior;

    public Filtro getFiltroSuperior() {
        return filtroSuperior;
    }

    public void setFiltroSuperior(Filtro filtroSuperior) {
        this.filtroSuperior = filtroSuperior;
    }

    public abstract String getDescricaoFiltro();

    public String verificarConteudo(Postagem postagem) {
        if (listaConteudos.contains(postagem.getTipoConteudo())) {
            return getDescricaoFiltro();
        }
        else {
            if (filtroSuperior != null) {
                return filtroSuperior.verificarConteudo(postagem);
            }
            else {
                return "Conteúdo aprovado";
            }
        }
    }
}