package com.example.telegrambotbackend.service;

import com.example.telegrambotbackend.dao.ShardRepository;
import com.example.telegrambotbackend.entity.Shard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShardServiceImpl implements ShardService {

    @Autowired
    private ShardRepository shardRepository;

    @Override
    public List<Shard> getAllShards() {
        return shardRepository.findAll();
    }

    @Override
    public void saveShard(Shard shard) {
        shardRepository.save(shard);
    }

    @Override
    public Shard getShard(int id) {
        Shard shard = null;

        Optional<Shard> optional = shardRepository.findById(id);
        if (optional.isPresent()) {
            shard = optional.get();
        }

        return shard;
    }

    @Override
    public void deleteShard(int id) {
        shardRepository.deleteById(id);
    }
}
