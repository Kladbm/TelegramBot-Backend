package com.example.telegrambotbackend.controller;

import com.example.telegrambotbackend.entity.Shard;
import com.example.telegrambotbackend.service.ShardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ShardController {

    @Autowired
    private ShardService shardService;

    @GetMapping("/shards")
    public List<Shard> getAllShards() {
        return shardService.getAllShards();
    }

    @GetMapping("/shards/{id}")
    public Shard getShard(@PathVariable int id) {
        return shardService.getShard(id);
    }

    @PostMapping("/shards")
    public Shard addShard(@RequestBody Shard shard) {
        shardService.saveShard(shard);
        return shard;
    }

    @PutMapping("/shards")
    public Shard updateShard(@RequestBody Shard shard) {
        shardService.saveShard(shard);
        return shard;
    }

    @DeleteMapping("/shards/{id}")
    public String deleteShard(@PathVariable int id) {
        shardService.deleteShard(id);
        return "Shard with ID: " + id + " was deleted";
    }
}
