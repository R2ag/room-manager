package com.rlag.romapi.model.DTO.request;

import com.rlag.romapi.model.entity.Room;
import lombok.*;

import javax.validation.constraints.NotEmpty;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoomDTO {

    @NotEmpty
    private String name;

    @NotEmpty
    private int number;

    @NotEmpty
    private String location;

    public RoomDTO toDTO(Room room){
        return new RoomDTO(room.getName(), room.getNumber(), room.getLocation());
    }

    public Room toModel(RoomDTO roomDTO){
        return new Room(roomDTO.getName(), roomDTO.getNumber(), roomDTO.getLocation());
    }

}
