package academy.devdojo.Springboot2_essentials.service;

import academy.devdojo.Springboot2_essentials.domain.Anime;
import academy.devdojo.Springboot2_essentials.repository.AnimeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AnimeService {

    private List<Anime> animes = List.of(new Anime(7L,"Cristiano Ronaldo"), new Anime(10L,"Messi"));

    public List<Anime> listAll() {
        return animes;
    }

    public Anime findById(long id) {
        return animes.stream()
                .filter(anime -> anime.getId() == id)
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Jogador NOT FOUND!"));

    }
}
