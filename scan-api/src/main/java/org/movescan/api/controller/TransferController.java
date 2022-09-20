package org.movescan.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.movescan.entity.TransferEntity;
import org.springframework.web.bind.annotation.*;
import org.starcoin.api.Result;

import java.io.IOException;

@Api(tags = "transfer")
@RestController
@RequestMapping("v1/transfer")
public class TransferController {
    @ApiOperation("get transfer list")
    @GetMapping("/{network}/page/{page}")
    public Result<TransferEntity> getTransferList(@PathVariable("network") String network, @PathVariable("page") int page,
                                                  @RequestParam(value = "count", required = false, defaultValue = "20") int count,
                                                  @RequestParam(value = "query_type", required = false, defaultValue = "1") int queryType) {
        return null;
    }

    @ApiOperation("get transfer list by address")
    @GetMapping("/{network}/byAddress/{address}")
    public Result<TransferEntity> getTransferByAddress(@PathVariable("network") String network, @PathVariable("address") String address,
                                                    @PathVariable(value = "page", required = false) int page,
                                                    @RequestParam(value = "count", required = false, defaultValue = "20") int count,
                                                    @RequestParam(value = "query_type", required = false, defaultValue = "1") int queryType
                                                            ) throws IOException {
        return null;
    }

    @ApiOperation("get transfer list by tag")
    @GetMapping("/{network}/byTag/{type_tag}")
    public Result<TransferEntity> getTransferByTag(@PathVariable("network") String network, @PathVariable("type_tag") String type_tag,
                                                   @PathVariable(value = "page", required = false) int page,
                                                   @RequestParam(value = "count", required = false, defaultValue = "20") int count
    ) throws IOException {
        return null;
    }
}
