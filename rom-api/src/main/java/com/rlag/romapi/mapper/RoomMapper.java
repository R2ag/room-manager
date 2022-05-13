package com.rlag.romapi.mapper;

import com.rlag.romapi.model.DTO.request.RoomDTO;
import com.rlag.romapi.model.entity.Room;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper(componentModel = "spring")
public interface RoomMapper {
    RoomMapper INSTANCE = Mappers.getMapper(RoomMapper.class);

    RoomDTO toDTO(Room room);

    Room toModel(RoomDTO roomDTO);
}
