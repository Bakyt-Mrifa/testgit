package kg.megacom.controllers;

import kg.megacom.models.entity.Lot;
import kg.megacom.services.LotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/lots")
public class LotController {
    @Autowired
    private LotService lotService;
    @PostMapping(value = "/save")
    public Lot saveLot(@RequestBody Lot lot) {
        return lotService.saveLot(lot);
    }
    @GetMapping("/get/{id}")
    public Lot getLotById(@PathVariable Long id){
        return lotService.findLotById(id);
    }

}
