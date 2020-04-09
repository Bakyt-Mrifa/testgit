package kg.megacom.controllers;

import io.swagger.annotations.Api;
import kg.megacom.models.dto.LotDto;
import kg.megacom.models.entity.Lot;
import kg.megacom.services.LotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/lots")
@Api(value = "Lot Management", description = "Методы для управления лотами")
public class LotController {
    @Autowired
    private LotService lotService;
    @PostMapping(value = "/save")
    public LotDto saveLot(@RequestBody LotDto lotDto) {
        return lotService.saveLot(lotDto);
    }
    @GetMapping("/get/{id}")
    public LotDto getLotById(@PathVariable Long id){
        return lotService.findLotById(id);
    }

}
