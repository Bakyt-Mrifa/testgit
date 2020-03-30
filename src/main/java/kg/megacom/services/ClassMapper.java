package kg.megacom.services;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClassMapper {
    ClassMapper INSTANCE= Mappers.getMapper(ClassMapper.class);

}
