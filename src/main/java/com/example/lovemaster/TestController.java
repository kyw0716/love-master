package com.example.lovemaster;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ApiOperation("테스트용 컨트롤러")
public class TestController {

    @GetMapping("/")
    public String home(){
        return "서버 잘 띄워졌어요 ^^";
    }

    @CrossOrigin
    @GetMapping("/api/hello")
    @ApiOperation("안녕이라고 인사를 해 준다...")
    public String hello() {
        return "hello";
    }

}
