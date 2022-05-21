package com.rlag.romapi.DTO.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
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

}
