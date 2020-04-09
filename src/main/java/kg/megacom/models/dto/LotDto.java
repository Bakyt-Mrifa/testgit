package kg.megacom.models.dto;

import lombok.Data;

import java.util.Date;

@Data
public class LotDto {
    private Integer id;
    private String name;
    private double minPrice;
    private double priceForBuy;
    private double step;
    private Date startDate;
    private Date endDate;
    private StatusDto statusDto;

}
