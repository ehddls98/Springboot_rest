package com.study.rest.di;

import org.springframework.stereotype.Component;

@Component
public class D { //IOC 컨테이너에 컴포넌트로 등록

    public void dCall() {

        System.out.println("D 객체에서 메서드 호출");
    }
}
