package tomasz.szymaski.skoki.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tomasz.szymaski.skoki.repo.SkoczekRepository;
import tomasz.szymaski.skoki.shared.dto.SkoczekDTO;
import tomasz.szymaski.skoki.entity.SkoczekEntity;
import tomasz.szymaski.skoki.service.SkoczekService;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements SkoczekService {

    @Autowired
    SkoczekRepository repo;

    @Override
    public SkoczekDTO creteSkoczek(SkoczekDTO skoczek) {
        if( repo.findByPesel(skoczek.getPesel())!= null) throw new RuntimeException("Skoczek istnieje");

        SkoczekEntity skoczekEntity = new SkoczekEntity();
        BeanUtils.copyProperties(skoczek,skoczekEntity);

        SkoczekEntity zapisany = repo.save(skoczekEntity);

        SkoczekDTO returnValue = new SkoczekDTO();
        BeanUtils.copyProperties(zapisany,returnValue);

        return returnValue;
    }

    @Override
    public List<SkoczekDTO> getSkoczkowie() {
        List<SkoczekDTO> returnValue = new ArrayList<>();
        Iterable<SkoczekEntity> skoczkowie = repo.findAll();
        for(SkoczekEntity skoczek : skoczkowie){
            SkoczekDTO kolejny = new SkoczekDTO();
            BeanUtils.copyProperties(skoczek,kolejny);
            returnValue.add(kolejny);
        }
        return returnValue;
    }

    @Override
    public SkoczekDTO getSkoczek(long id) {

        SkoczekEntity zapisany = repo.findById(id);
        SkoczekDTO returnValue = new SkoczekDTO();
        if(zapisany!=null)
            BeanUtils.copyProperties(zapisany,returnValue);
        return returnValue;
    }

    @Override
    public SkoczekDTO updateSkoczek(SkoczekDTO skoczek) {
        SkoczekEntity zapisany = repo.findByPesel(skoczek.getPesel());
        skoczek.setId(zapisany.getId());
        BeanUtils.copyProperties(skoczek,zapisany);
        repo.save(zapisany);
        SkoczekDTO returnValue = new SkoczekDTO();
        BeanUtils.copyProperties(zapisany,returnValue);

        return returnValue;
    }


    @Override
    public boolean deleteSkoczek(long id) {
        SkoczekEntity zapisany = repo.findById(id);
        if(zapisany == null)
            return false;
        repo.delete(zapisany);
        return true;
    }
}
