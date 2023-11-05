package com.jojoldu.book.springboot;

public class Annotation {
/*

@RestController             : JSON 반환 컨트롤러, @ResponseBody 선언했던걸 한번에 사용할 수 있게 해준다는 느낌
@Autowired                  : Bean을 주입(스프링 관리 Bean)
@RequiredArgsConstructor    : final 필드가 포함된 생성자 생성
@GetMapping("/hello")       : HTTP Method인 Get요청을 받을 수 있는 API

@RunWith(SpringRunner.class): springBootTest와 jUnit 연결
@WebMvcTest(controllers = HelloController.class) : Web(spring MVC)에 집중 가능한 어노테이션
@Getter                     : get 메소드 생성


private MockMvc mvc : Mvc 웹 API 테스트 시 사용, 테스트 시작점, GET, POST 의 API 테스트 가능
MockMvc 함수
- perform(get("/[Mapping]"))
    .andExpect(status().isOk()) : HTTP GET 요청(mvc를 통해),mvc 검증, 200, 404, 500 상태 검증
    .andExpect(content().string(hello)) : mvc 검증, 내용이 맞는지 검증


*/
}

