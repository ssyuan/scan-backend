package org.movescan.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.movescan.entity.AddressEntity;
import org.springframework.web.bind.annotation.*;
import org.starcoin.api.Result;

@Api(tags = "address")
@RestController
@RequestMapping("v1/address")
public class AddressController {

    @ApiOperation("get address list")
    @GetMapping("/{network}/page/{page}")
    public Result<AddressEntity> getAddressList(@PathVariable("network") String network, @PathVariable("page") int page,
                                                 @RequestParam(value = "count", required = false, defaultValue = "20") int count) {
        return null;
    }

    @ApiOperation("get address info")
    @GetMapping("/{network}/{address}")
    public AddressEntity getAddressInfo(@PathVariable("network") String network, @PathVariable("address") String address) {
        //TODO get chain data
        return null;
    }
}
