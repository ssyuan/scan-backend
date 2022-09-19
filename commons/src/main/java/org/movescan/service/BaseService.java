package org.movescan.service;

import org.movescan.repository.BlockRepository;
import org.movescan.repository.starcoin.main.StarcoinMainBlockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseService {
    @Autowired
    private StarcoinMainBlockRepository starcoinMainBlockRepository;

    public BlockRepository getBlockRepository(String network) {
        return starcoinMainBlockRepository;
    }
}
