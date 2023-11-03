package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostagemTest {

    Filtro filtroLinksMaliciosos;
    Filtro filtroImagensInapropriadas;
    Filtro filtroPalavrasProibidas;

    @BeforeEach
    void setUp() {
        filtroLinksMaliciosos = new FiltroLinksMaliciosos(null);
        filtroImagensInapropriadas = new FiltroImagensInapropriadas(filtroLinksMaliciosos);
        filtroPalavrasProibidas = new FiltroPalavrasProibidas(filtroImagensInapropriadas);
    }

    @Test
    void deveRetornarPalavrasProibidasParaConteudoInapropriado() {
        assertEquals("Conteúdo contém palavras proibidas", filtroPalavrasProibidas.verificarConteudo(new Postagem(TipoConteudoPalavrasProibidas.getTipoConteudoPalavrasProibidas())));
    }

    @Test
    void deveRetornarImagensInapropriadasParaConteudoInapropriado() {
        assertEquals("Conteúdo contém imagens inapropriadas", filtroPalavrasProibidas.verificarConteudo(new Postagem(TipoConteudoImagensInapropriadas.getTipoConteudoImagensInapropriadas())));
    }

    @Test
    void deveRetornarLinksMaliciososParaConteudoInapropriado() {
        assertEquals("Conteúdo contém links maliciosos", filtroPalavrasProibidas.verificarConteudo(new Postagem(TipoConteudoLinksMaliciosos.getTipoConteudoLinksMaliciosos())));
    }

    @Test
    void deveRetornarConteudoAprovadoParaConteudoAdequado() {
        assertEquals("Conteúdo aprovado", filtroPalavrasProibidas.verificarConteudo(new Postagem(TipoConteudoAdequado.getTipoConteudoAdequado())));
    }

}
