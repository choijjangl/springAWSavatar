package com.jojoldu.book.springboot;

        import com.jojoldu.book.springboot.web.HelloController;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
        import org.springframework.test.context.junit4.SpringRunner;
        import org.springframework.test.web.servlet.MockMvc;

        import static org.hamcrest.Matchers.is;
        import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
        import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
        import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
        import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)    // springBootTest와 jUnit 연결
@WebMvcTest(controllers = HelloController.class) // Web(spring MVC)에 집중 가능한 어노테이션
public class HelloControllerTest {

    @Autowired // Bean을 주입(스프링 관리 Bean)
    private MockMvc mvc;
    /*
     - Mvc 웹 API 테스트 시 사용
     - 테스트 시작점
     - GET, POST 의 API 테스트 가능
    */
    @Test
    public void hello가_리턴된다() throws Exception{

        String hello = "hello";

        mvc.perform(get("/hello"))
                // HTTP GET 요청(mvc를 통해)
                .andExpect(status().isOk())
                // mvc 검증, 200, 404, 500 상태 검증
                .andExpect(content().string(hello));
        // mvc 검증, 내용이 맞는지 검증
    }
    // 실행시 /hello의 return 값이 hello인지 확인하는 test메소드

    public void helloDto가_리턴된다() throws Exception{

        String name = "hello";
        int amount = 1000;

        mvc.perform(
                get("/hello/dto")
                        .param("name", name)
                        .param("amount", String.valueOf(amount))) // String으로 형변환, Param으로 넘기려면 '문자열'이여야함
                .andExpect(status().isOk()) // 200, 404, 500 검증
                .andExpect(jsonPath("$.name", is(name)))
                .andExpect(jsonPath("$.amount",is(amount)));
    }
}
