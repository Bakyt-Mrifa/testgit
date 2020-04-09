package kg.megacom.mapping;

import kg.megacom.models.dto.*;
import kg.megacom.models.entity.*;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClassMapper {

    ClassMapper INSTANCE= Mappers.getMapper(ClassMapper.class);
//Bid
    Bid bidDtoToBid(BidDto bidDto);
    BidDto bidToBidDto(Bid bid);

//Customer
    Customer customerDtoToCustomer (CustomerDto customerDto);
    CustomerDto customerToCustomerDto (Customer customer);

//Lot
    Lot lotDtoToLot (LotDto lotDto);
    LotDto lotToLotDto (Lot lot);
    void updateLotFromDto(LotDto lotDto, @MappingTarget Lot lot);

//Status
    Status statusDtoToStatus (StatusDto statusDto);
    StatusDto statusToStatusDto (Status status);

//User
    User userDtoToUser (UserDto userDto);
    UserDto userToUserDto (User user);

}
