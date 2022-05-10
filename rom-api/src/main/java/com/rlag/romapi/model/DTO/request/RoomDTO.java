package com.rlag.romapi.model.DTO.request;

import com.rlag.romapi.model.entity.Room;
import lombok.*;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
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

    public Room toObject(){
        return new Room(name, number, location);
    }

    public RoomDTO toDTO(Room room){
        return new RoomDTO(room.getName(), room.getNumber(), room.getLocation());
    }
}
