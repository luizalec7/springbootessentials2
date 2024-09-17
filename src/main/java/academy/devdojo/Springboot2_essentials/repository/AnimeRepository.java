package academy.devdojo.Springboot2_essentials.repository;

import academy.devdojo.Springboot2_essentials.domain.Anime;

import java.util.List;

public interface AnimeRepository {
    List<Anime> listAll();
}
