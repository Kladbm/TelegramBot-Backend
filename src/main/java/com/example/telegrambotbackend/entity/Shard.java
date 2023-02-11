package com.example.telegrambotbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "shards")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "user_id")
    private String user_id;

    @Column(name = "date_time")
    private String date_time;

    @Column(name = "shard")
    private String shard;

    @Column(name = "first_location")
    private String first_location;

    @Column(name = "second_location")
    private String second_location;
}
