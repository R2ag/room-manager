package com.rlag.romapi.controller;

import com.rlag.romapi.model.DTO.request.RoomDTO;
import com.rlag.romapi.model.entity.Room;
import com.rlag.romapi.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/room")
public class RoomController {
    @Autowired
    private RoomService roomService;

    @PostMapping
    public Room createRoom(@RequestBody @Valid RoomDTO roomDTO){
        return roomService.createRoom(roomDTO);
    }

    @GetMapping
    public List<RoomDTO> roomDTOList(){
        return roomService.listAll();
    }
}
