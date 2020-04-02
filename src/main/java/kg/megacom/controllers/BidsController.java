package kg.megacom.controllers;

import kg.megacom.models.entity.Bid;
import kg.megacom.services.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class BidsController {
    @Autowired
    private BidService bidService;
    @PostMapping(value = "/save")
    public Bid saveBids(@RequestBody Bid bid) {
        return bidService.saveBid(bid);
    }
    @GetMapping("/get/{id}")
    public Bid getBidById(@PathVariable Long id){
        return bidService.findBidById(id);
    }
}
