package academy.devdojo.Springboot2_essentials.controller;

import academy.devdojo.Springboot2_essentials.domain.Anime;
import academy.devdojo.Springboot2_essentials.service.AnimeService;
import academy.devdojo.Springboot2_essentials.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("animes")
@Log4j2
@RequiredArgsConstructor
public class AnimeController {
    private final DateUtil dateUtil;
    private final AnimeService animeService;

    @GetMapping
    public List<Anime> list(){
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return animeService.listAll();
    }
}
