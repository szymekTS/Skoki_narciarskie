package tomasz.szymaski.skoki.controlers;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tomasz.szymaski.skoki.shared.dto.SkoczekDTO;
import tomasz.szymaski.skoki.model.request.SkoczekRequestModel;
import tomasz.szymaski.skoki.model.response.SkoczekRest;
import tomasz.szymaski.skoki.service.SkoczekService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("skoczek")
public class SkoczekController {

    @Autowired
    SkoczekService skoczekService;

    @GetMapping(path = "/{id}")
    public SkoczekRest getSkoczek(@PathVariable long id){
        SkoczekRest returnValue =  new SkoczekRest();
        SkoczekDTO foundSkoczek = skoczekService.getSkoczek(id);
        BeanUtils.copyProperties(foundSkoczek, returnValue);
        return returnValue;
    }

    @GetMapping
    public List<SkoczekRest> getAllSkoczek(){
        List<SkoczekRest> returnList = new ArrayList<>();
        List<SkoczekDTO> posiadane = skoczekService.getSkoczkowie();
        for(SkoczekDTO doListy : posiadane){
            SkoczekRest kolejny = new SkoczekRest();
            BeanUtils.copyProperties(doListy, kolejny);
            returnList.add(kolejny);
        }
        return returnList;
    }

    @PostMapping
    public SkoczekRest createSkoczek(@RequestBody SkoczekRequestModel skoczekDetail){
        SkoczekRest returnValue =  new SkoczekRest();
        SkoczekDTO skoczekDTO = new SkoczekDTO();
        BeanUtils.copyProperties(skoczekDetail, skoczekDTO);
        SkoczekDTO createdSkoczek = skoczekService.creteSkoczek(skoczekDTO);
        BeanUtils.copyProperties(createdSkoczek, returnValue);
        return returnValue;
    }

    @PutMapping
    public SkoczekRest updateSkoczek(@RequestBody SkoczekRequestModel skoczekDetail){
        SkoczekRest returnValue =  new SkoczekRest();
        SkoczekDTO skoczekDTO = new SkoczekDTO();
        BeanUtils.copyProperties(skoczekDetail, skoczekDTO);
        SkoczekDTO createdSkoczek = skoczekService.updateSkoczek(skoczekDTO);
        BeanUtils.copyProperties(createdSkoczek, returnValue);
        return returnValue;
    }

    @DeleteMapping(path = "/{id}")
    public String deleteSkoczek(@PathVariable long id){
        if(skoczekService.deleteSkoczek(id))
            return "ok";
        else
            return "Nie znaleziono";

    }


}
