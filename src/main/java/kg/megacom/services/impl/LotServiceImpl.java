package kg.megacom.services.impl;

import kg.megacom.mapping.ClassMapper;
import kg.megacom.models.dto.LotDto;
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
    public LotDto saveLot(LotDto lotDto) {
/*        Lot lot = null;
        ClassMapper.INSTANCE.updateLotFromDto(lotDto, lot);*/
        Lot lot=ClassMapper.INSTANCE.lotDtoToLot(lotDto);
        lot=lotRepository.save(lot);
        System.out.println("This is object of Lot: " + lot);
        lotDto=ClassMapper.INSTANCE.lotToLotDto(lot);
        System.out.println("This is object of LotDto: " + lotDto);
        return lotDto;
    }

    @Override
    public Lot findLotById(Long id) {
        Lot lot=lotRepository.findById(id).orElse(new Lot());
        return lot;
    }
}
