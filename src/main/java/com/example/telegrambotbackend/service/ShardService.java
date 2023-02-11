package com.example.telegrambotbackend.service;

import com.example.telegrambotbackend.entity.Shard;

import java.util.List;

public interface ShardService {

    public List<Shard> getAllShards();

    public void saveShard(Shard shard);

    public Shard getShard(int id);

    public void deleteShard(int id);
}
