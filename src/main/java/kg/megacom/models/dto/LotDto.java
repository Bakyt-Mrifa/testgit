package kg.megacom.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class LotDto {
    private Integer id;
    @JsonProperty("lotName")
    private String name;
    private double minPrice;
    @JsonProperty("lotPrice")
    private double priceForBuy;
    private double step;
 //   @DateTimeFormat(pattern = "dd.MM.yyyy")
    private Date startDate;
  //  @DateTimeFormat(pattern = "dd.MM.yyyy")
    private Date endDate;
    private StatusDto statusDto;

}
