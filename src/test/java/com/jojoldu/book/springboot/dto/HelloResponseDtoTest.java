package com.jojoldu.book.springboot.dto;

import com.jojoldu.book.springboot.web.dto.HelloResponseDto;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트(){
        //given
        String name = "test";
        int amount = 1000;

        //when
        // dto에 값을 전달하여 get을 확인하기 위해 객체 생성
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        //assert 주장하다, that 그것, equalto : 동일하다
        assertThat(dto.getName()).isEqualTo(name);
        // 검증하고 싶은 대상을 메소드 인자로 받음.
        // isEqualTo와 assertThat의 값을 비교 같을 때 true
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
    // 롬복기능이 제대로 돌아가는지 dto객체에 매개변수로 생성 후 값이 맞는지 확인
}
