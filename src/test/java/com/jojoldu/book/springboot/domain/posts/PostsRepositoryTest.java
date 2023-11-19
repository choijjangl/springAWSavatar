package com.jojoldu.book.springboot.domain.posts;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository; // 인터페이스

    @After  // junit 단위 테스트가 끝날 때마다 수행
            // 배포 전 전체 테스트를 수행할 때 테스트간 데이터 침범을 막기위해 사용
    public void cleanup(){
        postsRepository.deleteAll();
    }

    @Test
    public void boardSaveOpen(){    // 게시글 저장 불러오기
        String title = "테스트 게시글";
        String content = "테스트 본문";

        postsRepository.save(Posts.builder() // Posts의 Builder를 호출 Entity의 함수 // .save(); 있으면 insert 없으면 update
                .title(title)
                .content(content)
                .author("chlalstn0123@gmail.com")
                .build()); // posts의 insert, update 쿼리 실행
        List<Posts> postsList = postsRepository.findAll();  // findAll() : posts에 있는 모든 데이터를 조회

        Posts posts = postsList.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);
    }
}