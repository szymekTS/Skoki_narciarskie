package tomasz.szymaski.skoki.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tomasz.szymaski.skoki.entity.SkoczekEntity;

@Repository
public interface SkoczekRepository extends CrudRepository<SkoczekEntity,Long> {
    SkoczekEntity findByPesel(long pesel);
    SkoczekEntity findById(long id);
}
