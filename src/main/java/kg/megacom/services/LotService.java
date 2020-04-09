package kg.megacom.services;

import kg.megacom.models.dto.LotDto;
import kg.megacom.models.entity.Lot;

public interface LotService {
    LotDto saveLot(LotDto lotDto);
    LotDto findLotById(Long id);

}
