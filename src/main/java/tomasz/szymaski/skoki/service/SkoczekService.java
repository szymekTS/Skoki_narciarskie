package tomasz.szymaski.skoki.service;

import tomasz.szymaski.skoki.shared.dto.SkoczekDTO;

import java.util.List;

public interface SkoczekService {
    SkoczekDTO creteSkoczek(SkoczekDTO skoczek);
    SkoczekDTO getSkoczek(long id);
    List<SkoczekDTO> getSkoczkowie();
    SkoczekDTO updateSkoczek(SkoczekDTO skoczek);
    boolean deleteSkoczek(long id);

}
