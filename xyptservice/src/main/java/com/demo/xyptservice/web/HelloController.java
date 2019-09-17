package com.demo.xyptservice.web;

import com.demo.xyptservice.service.HelloService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author maozd
 * @date 2019/9/14 14:56
 */
@Api(value = "测试类",description = "Swagger test")
@RestController
@RequestMapping("test")
public class HelloController {

    @Resource
    private HelloService helloService;

    @ApiOperation(value = "测试接口", notes = "测试接口")
    @ApiImplicitParam(name = "name", value = "姓名", required = true, paramType = "query", dataType = "String")
    @GetMapping("/hello")
    public String testHello(@RequestParam(name = "name") String name) throws Exception {
        return helloService.testHello(name);
    }
}
