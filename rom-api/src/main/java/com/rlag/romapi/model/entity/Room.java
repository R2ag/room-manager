package com.rlag.romapi.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private int number;

    @Column
    private String location;

    @OneToMany(mappedBy = "room")
    private List<Booking> bookings;

    public Room(String name, int number, String location){
        this.name = name;
        this.number = number;
        this.location = location;
    }
}
