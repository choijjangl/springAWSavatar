package com.jojoldu.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter // get 메소드 생성
@RequiredArgsConstructor // final 필드가 포함된 생성자 생성
public class HelloResponseDto {

private final String name;
private final int amount;

        }
