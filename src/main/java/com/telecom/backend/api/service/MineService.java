package com.telecom.backend.api.service;

import com.telecom.backend.api.entity.MineEntity;
import com.telecom.backend.api.repository.MineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MineService {

    @Autowired
    private MineRepository mineRepository;

    public List<MineEntity> getAllMineEntries() {
        return mineRepository.findAll();
    }
}
