package kg.megacom.services;

import kg.megacom.models.dto.LotDto;

public interface LotService {
    LotDto saveLot(LotDto lotDto);
    LotDto findLotById(Long id);

}
