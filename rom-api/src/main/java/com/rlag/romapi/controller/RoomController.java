package com.rlag.romapi.controller;

import com.rlag.romapi.model.entity.Room;
import com.rlag.romapi.service.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {
    @Autowired
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
