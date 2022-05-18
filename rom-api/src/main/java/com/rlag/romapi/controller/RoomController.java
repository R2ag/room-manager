package com.rlag.romapi.controller;

import com.rlag.romapi.model.DTO.request.RoomDTO;
import com.rlag.romapi.model.entity.Room;
import com.rlag.romapi.service.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/room")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class RoomController {

    private RoomService roomService;

    @PostMapping
    public Room createRoom(@RequestBody @Valid Room room){
        return roomService.createRoom(room);
    }

    @GetMapping
    public List<Room> roomList(){
        return roomService.listAll();
    }
}
