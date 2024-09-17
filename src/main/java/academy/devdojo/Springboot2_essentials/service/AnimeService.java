package academy.devdojo.Springboot2_essentials.service;

import academy.devdojo.Springboot2_essentials.domain.Anime;
import academy.devdojo.Springboot2_essentials.repository.AnimeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {
    public List<Anime> listAll() {
        return  List.of(new Anime(7L,"Cristiano Ronaldo"), new Anime(10L,"Messi"));
    }
}
