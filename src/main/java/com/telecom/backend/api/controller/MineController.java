package com.telecom.backend.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.telecom.backend.api.entity.MineEntity;
import com.telecom.backend.api.model.Mine;
import com.telecom.backend.api.service.MineService;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MineController {

    @Autowired
    private MineService mineService;

    @GetMapping("/all")
    public ResponseEntity<List<Mine>> getAllEmployees() {
        List<Mine> employees = mineService.getAllMineEntries().stream().map(this::convertToMine).collect(Collectors.toList());
        return ResponseEntity.ok().body(employees);
    }

    private Mine convertToMine(MineEntity mineEntity) {
        Mine mine = new Mine();
        mine.setName(mineEntity.getName());
        mine.setValue(mineEntity.getValue());
        return mine;
    }
}
