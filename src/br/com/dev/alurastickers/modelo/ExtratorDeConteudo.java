package br.com.dev.alurastickers.modelo;

import java.util.List;

public interface ExtratorDeConteudo {
    List<Conteudo> extraiConteudos(String json);
}
