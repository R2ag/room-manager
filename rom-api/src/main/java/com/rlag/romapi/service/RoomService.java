package com.rlag.romapi.service;

import com.rlag.romapi.model.DTO.request.RoomDTO;
import com.rlag.romapi.model.entity.Room;
import com.rlag.romapi.repository.RoomRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;
    private RoomDTO roomDTO;

    public Room createRoom(RoomDTO room) {
        Room roomToSave = room.toObject();

        Room savedRoom = roomRepository.save(roomToSave);
        return savedRoom;
    }

    public List<RoomDTO> listAll() {
        List<Room> allRoom = roomRepository.findAll();
        return allRoom.stream()
                .map(roomDTO::toDTO)
                .collect(Collectors.toList());

    }
}
