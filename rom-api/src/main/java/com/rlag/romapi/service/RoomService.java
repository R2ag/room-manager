package com.rlag.romapi.service;

import com.rlag.romapi.model.DTO.request.RoomDTO;
import com.rlag.romapi.model.entity.Room;
import com.rlag.romapi.repository.RoomRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoomService {

    private RoomRepository roomRepository;

    public Room createRoom(Room room) {
        Room savedRoom = roomRepository.save(room);
        return savedRoom;
    }

    public List<Room> listAll() {
        List<Room> allRoom = roomRepository.findAll();
        return allRoom;

    }
}
