package org.movescan.api.service;

import org.movescan.entity.BlockEntity;
import org.movescan.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class BlockService extends BaseService {
    public BlockEntity getBlock(String network, String hash) {
        return getBlockRepository(network).getById(hash);
    }
}
