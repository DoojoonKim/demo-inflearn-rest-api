package com.connorserver.demoinflearnrestapi.events;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.http.ResponseEntity.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@ExtendWith(SpringExtension.class)
@WebMvcTest // 웨관련 Bean들이 모두 등록된다
public class EventControllerTests {

    @Autowired
    MockMvc mockMvc; // 목으로 ㅂ만들어진 디스패처 서클릿을 상대로 가짜 요청을 대스페터 서블리셍 보내고 응답을 확인할 숭 있다.
    // 디스패치 서블릿을 만들어야 하기에 단위 테스트보다는 조므 더 걸린다.

    @Test
    public void createEvent() throws Exception {
        mockMvc.perform(post("/api/events/")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .accept(MediaTypes.HAL_JSON)).andExpect(status().isCreated());


    }



}
