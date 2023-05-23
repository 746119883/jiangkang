package com.jk.work.java.framework.swagger.controller;

import com.jk.work.java.framework.swagger.qo.SwaggerTestQo;
import com.jk.work.java.framework.swagger.vo.SwaggerTestVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: kang.jiang
 * @Description:
 * @Date: create in 2021/11/12 上午10:46
 */
@Api(tags = "测试1")
@RestController
@RequestMapping("/test1")
public class SwaggerTestController {


    @ApiOperation("一")
    @GetMapping("/test1")
    public List<SwaggerTestVo> testOne(SwaggerTestQo swaggerTestQo){

        return new ArrayList<>();
    }

    @ApiOperation("二")
    @PostMapping("/test2")
    public List<SwaggerTestVo> testTwo(SwaggerTestQo swaggerTestQo){
        throw new RuntimeException("134");
        //return new ArrayList<>();
    }

    @ApiOperation("三")
    @GetMapping("/test3")
    public List<SwaggerTestVo> testThree(@RequestBody SwaggerTestQo swaggerTestQo){

        throw new RuntimeException("134");
        //return new ArrayList<>();
    }



}
