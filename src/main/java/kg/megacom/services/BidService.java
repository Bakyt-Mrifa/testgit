package kg.megacom.services;

import kg.megacom.models.entity.Bid;

public interface BidService {
    Bid saveBid(Bid bit);
    Bid findBidById(Long id);
}
