package br.com.thiago.repository;

import br.com.thiago.domain.Anime;

import java.util.List;

public interface AnimeRepository  {
    List<Anime> listAll();
}
