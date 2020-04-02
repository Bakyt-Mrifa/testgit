package kg.megacom.services;

import kg.megacom.models.entity.Lot;

public interface LotService {
    Lot saveLot(Lot lot);
    Lot findLotById(Long id);

}
