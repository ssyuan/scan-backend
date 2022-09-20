package org.movescan.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.movescan.entity.TransactionEntity;
import org.springframework.web.bind.annotation.*;
import org.starcoin.api.Result;

import java.io.IOException;

@Api(tags = "transaction")
@RestController
@RequestMapping("v1/transaction")
public class TransactionController {

    @ApiOperation("get transaction by Hash")
    @GetMapping("/{network}/{hash}")
    public TransactionEntity getTransaction(@PathVariable("network") String network, @PathVariable("hash") String hash) {
        return null;
    }

    @ApiOperation("get transaction list")
    @GetMapping("/{network}/page/{page}")
    public Result<TransactionEntity> getTransactionList(@PathVariable("network") String network, @PathVariable("page") int page,
                                                        @RequestParam(value = "count", required = false, defaultValue = "20") int count,
                                                        @RequestParam(value = "start_height", required = false, defaultValue = "0") int startHeight,
                                                        @RequestParam(value = "txn_type", required = false, defaultValue = "1") int txnType) {
        return null;
    }

    @ApiOperation("get transaction list by address")
    @GetMapping("/{network}/byAddress/{address}")
    public Result<TransactionEntity> getTransactionsByAddress(@PathVariable("network") String network, @PathVariable("address") String address,
                                                              @RequestParam(value = "page", required = false, defaultValue = "1") int page,
                                                              @RequestParam(value = "count", required = false, defaultValue = "20") int count,
                                                              @RequestParam(value = "txn_type", required = false, defaultValue = "0") int txnType,
                                                              @RequestParam(value = "with_event", required = false, defaultValue = "false") boolean withEvent) throws IOException {
        return null;
    }



}
