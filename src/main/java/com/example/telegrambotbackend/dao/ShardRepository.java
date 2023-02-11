package com.example.telegrambotbackend.dao;

import com.example.telegrambotbackend.entity.Shard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShardRepository extends JpaRepository<Shard, Integer> {
}
