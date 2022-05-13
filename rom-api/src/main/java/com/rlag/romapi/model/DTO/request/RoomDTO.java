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

}
