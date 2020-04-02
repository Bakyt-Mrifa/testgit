package kg.megacom.services.impl;

import kg.megacom.models.entity.Lot;
import kg.megacom.repository.LotRepository;
import kg.megacom.services.LotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LotServiceImpl implements LotService {

    @Autowired
    private LotRepository lotRepository;
    @Override
    public Lot saveLot(Lot lot) {
        return lotRepository.save(lot);
    }

    @Override
    public Lot findLotById(Long id) {
        Lot lot=lotRepository.findById(id).orElse(new Lot());
        return lot;
    }
}
