package com.connorserver.demoinflearnrestapi.events;

import lombok.*;

import java.time.LocalDateTime;

@Builder @AllArgsConstructor @NoArgsConstructor // 기본생정자와 모든 아규 가진 생성자 만들귀 위한 것
@Getter @Setter @EqualsAndHashCode(of = "id")
//(of = "id)를 한 이유 -> EqualsAndHashCode 을 구현 할때 는 기본적으로 모든 필드를  기본적으로 다 사용, 나중 엔터티간의 객체간의 연관관계에서 상호참조 관계가 되버리면
// EqualsAndHashCode를 구현한 코드내에서 stack of flow가 발생할 수 있다. id의 값만 가지고 EqualsAndHashCode를 비교하고자 한다.

public class Event {

    private Integer id;
    private String name;
    private String description;
    private LocalDateTime beginEnrollmentDataTime;
    private LocalDateTime closeEnrollmentDateTime;
    private LocalDateTime beginEventDataTime;
    private LocalDateTime endEventDateTime;
    private String location; // (Optional) 이게 없으면 온라인 모임
    private int basePrice; // (optional)
    private int maxPrice; // (optional)
    private int limitOfEnrollment;
    private boolean offline;
    private boolean free;
    private EventStatus eventStatus;

}
