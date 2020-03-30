package kg.megacom.models.dto;


import lombok.Data;

import java.util.Date;

@Data
public class BidDto {
    private Long id;
    private Date addDate;
    private double bidValue;
    private boolean Active;
    private LotDto lotDto;
    private CustomerDto customer;



}
