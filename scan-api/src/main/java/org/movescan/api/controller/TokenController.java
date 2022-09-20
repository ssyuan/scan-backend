package org.movescan.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.movescan.entity.TokenEntity;
import org.springframework.web.bind.annotation.*;
import org.starcoin.api.Result;

@Api(tags = "token")
@RestController
@RequestMapping("v1/token")
public class TokenController {
    @ApiOperation("get token list")
    @GetMapping("/{network}/page/{page}")
    public Result<TokenEntity> getTokenList(@PathVariable("network") String network, @PathVariable("page") int page,
                                              @RequestParam(value = "count", required = false, defaultValue = "20") int count) {
        return null;
    }

    @ApiOperation("get address info")
    @GetMapping("/{network}/{type_tag}")
    public TokenEntity getTokenInfo(@PathVariable("network") String network, @PathVariable("type_tag") String type_tag) {
        return null;
    }

}
