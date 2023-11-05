package com.jojoldu.book.springboot.web;

import com.jojoldu.book.springboot.web.dto.HelloResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
// JSON 반환 컨트롤러
// @ResponseBody 선언했던걸 한번에 사용할 수 있게 해준다는 느낌
public class HelloController {

    @GetMapping("/hello")// HTTP Method인 Get요청을 받을 수 있는 API
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name
                                    , @RequestParam ("amount") int amount){
        // 외부에서 api로 넘긴 파라미터 가져옴
        // @RequestParam("name") 에서 이름으로 넘긴 파라미터를 메소드 파라미터 name에 저장

        //여기까지 23.11.05

    }

}
