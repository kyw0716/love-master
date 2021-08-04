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

    @CrossOrigin
    @GetMapping("/api/info/{num}")
    @ApiOperation("1 넣으면 연희 2 넣으면 밍재")
    public testDTO info(@PathVariable Integer num) {
        testDTO build;
        if(num == 1) {
           build = testDTO.builder().age(123).name("연희").friend("영우").build();
        } else {
            build = testDTO.builder().age(6).name("밍재").friend("준형").build();
        }
        return build;
    }
}
