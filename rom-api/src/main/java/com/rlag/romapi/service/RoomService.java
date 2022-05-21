package com.rlag.romapi.service;

import com.rlag.romapi.model.entity.Room;
import com.rlag.romapi.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    public Room createRoom(Room room) {
        Room savedRoom = roomRepository.save(room);
        return savedRoom;
    }

    public List<Room> listAll() {
        return roomRepository.findAll();
    }
}
