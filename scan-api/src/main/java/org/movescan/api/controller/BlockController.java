package org.movescan.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.movescan.api.service.BlockService;
import org.movescan.entity.BlockEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.starcoin.api.Result;
import org.starcoin.bean.Block;

@Api(tags = "block")
@RestController
@RequestMapping("v1/block")
public class BlockController {
    @Autowired
    private BlockService blockService;

    @ApiOperation("get block by ID/Hash")
    @GetMapping("/{network}/{id}")
    public BlockEntity getBlock(@PathVariable("network") String network, @PathVariable("id") String id) {
        return blockService.getBlock(network, id);
    }

    @ApiOperation("get block by height")
    @GetMapping("/{network}/height/{height}")
    public Block getBlockByHeight(@PathVariable("network") String network, @PathVariable("height") long height) {
        return null;
    }

    @ApiOperation("get block summary by hash")
    @GetMapping("/{network}/summary/{hash}")
    public Block getBlockSummary(@PathVariable("network") String network, @PathVariable("hash") String hash) {
        return null;
    }

    @ApiOperation("get block list by start height")
    @GetMapping("/{network}/start_height/{start}")
    public Result<Block> getBlocksStartWith(@PathVariable("network") String network, @PathVariable(value = "start") long start_height,
                                            @RequestParam(value = "page", required = false, defaultValue = "1") int page,
                                            @RequestParam(value = "count", required = false, defaultValue = "20") int count
    ) {
        return null;
    }
}
